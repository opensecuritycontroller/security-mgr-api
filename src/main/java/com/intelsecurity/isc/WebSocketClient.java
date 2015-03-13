package com.intelsecurity.isc;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.websocket.CloseReason;
import javax.websocket.DeploymentException;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.glassfish.grizzly.ssl.SSLEngineConfigurator;
import org.glassfish.tyrus.client.ClientManager;
import org.glassfish.tyrus.client.ClientManager.ReconnectHandler;

import com.intelsecurity.isc.element.ApplianceManagerConnectorElement;
import com.intelsecurity.isc.manager.plugin.api.ManagerWebSocketNotificationApi;

public abstract class WebSocketClient {

    protected Session wsSession = null;
    private String uri;
    private final ManagerWebSocketNotificationApi clientEndpoint;
    protected ApplianceManagerConnectorElement mc = null;

    public ApplianceManagerConnectorElement getMc() {
        return mc;
    }

    private final static Logger log = Logger.getLogger(WebSocketClient.class);

    /**
     * @param mc
     *            Appliance Manager Connector (Web Socket Server) which we will be connecting to.
     * @param port
     *            Port at which Web Socket Server is listening
     * @param resourePath
     *            URL path to register/connect/subscribe
     * @param isHttps
     *            SSL enabled or disabled
     * @param webSocketClientEndpoint
     *            "ClientEndPoint" annotated object which will handle communication with server
     * @throws Exception
     *             Throws exception like {@link DeploymentException}, {@link IOException}, {@link URISyntaxException}
     *             etc..
     */
    public WebSocketClient(ApplianceManagerConnectorElement mc, int port, String resourePath, boolean isHttps,
            ManagerWebSocketNotificationApi webSocketClientEndpoint) throws Exception {
        this.mc = mc;
        this.clientEndpoint = webSocketClientEndpoint;
        ClientManager client = ClientManager.createClient();
        initURI(mc, port, resourePath, isHttps);
        if (isHttps) {
            SSLEngineConfigurator sslEngineConfigurator = new SSLEngineConfigurator(RestUtil.getSSLContext(), true,
                    false, false);
            client.getProperties().put(ClientManager.SSL_ENGINE_CONFIGURATOR, sslEngineConfigurator);
        }
        client.getProperties().put(ClientManager.RECONNECT_HANDLER, getReconnecHandler());
        log.info("Connecting to - " + URI.create(this.uri));

        login();

        this.wsSession = client.connectToServer(this.clientEndpoint, URI.create(this.uri));
    }

    /**
     * Method will allow to close opened Web Socket Connection *
     *
     * @throws IOException
     */
    public void close() throws IOException {
        log.info("Closing Web Socket Connection with - " + this.mc.getName());
        if (this.wsSession.isOpen()) {

            // wait until client finishes processing incoming messages then close this connection gracefully
            while (this.clientEndpoint.isProcessingMessage()) {
                try {
                    wait(500);
                } catch (Exception e) {
                    continue;
                }
            }

            this.wsSession.close(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE,
                    "Closing Connection Because MC is either Removed or Updated"));
        }

    }

    /**
     * @param mc
     *            Appliance Manager Connector Object to get IP address
     * @param port
     *            Port on which web socket server is listening
     * @param resourePath
     *            URL path where we can start connecting to the server
     * @param isHttps
     *            SSL enable or disable
     * @return
     *         Returns String URI which will be used to connect Server End Point
     */
    private void initURI(ApplianceManagerConnectorElement mc, int port, String resourePath, boolean isHttps) {
        if (isHttps) {
            this.uri = "wss://";

        } else {
            this.uri = "ws://";
        }
        this.uri += mc.getIpAddress() + ":" + port + "/" + resourePath;
    }

    /**
     * @return
     *         Returns an object of Reconnect Handler
     *         Responsible for reconnecting to the server when connection loses
     *         Handle any networking issues as well
     */
    private ReconnectHandler getReconnecHandler() {
        ClientManager.ReconnectHandler reconnectHandler = new ClientManager.ReconnectHandler() {
            @Override
            public boolean onDisconnect(CloseReason closeReason) {
                // If we close the session no need to reconnect
                if (closeReason.getCloseCode() == CloseReason.CloseCodes.NORMAL_CLOSURE) {
                    return false;
                }
                // Attempt to reconnect....
                log.info("Disconnected.... Trying to reconnect .... " + closeReason);
                return true;
            }

            @Override
            public boolean onConnectFailure(Exception exception) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    return false;
                }
                // Attempt to reconnect....
                log.error("Connection Failure... Attempting to reconnect ..." + exception.getMessage());
                return true;
            }
        };
        return reconnectHandler;
    }

    /**
     *
     * This method is responsible for authenticating client with web socket Server...
     * In Case of SMC a REST login call will be done using this method
     *
     *
     */

    public abstract void login();
}
