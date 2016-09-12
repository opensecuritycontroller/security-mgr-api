package org.osc.sdk.manager.api;

import java.io.IOException;

import javax.websocket.Session;

import org.osc.sdk.manager.element.MgrChangeNotification;

/**
 * This documents "Web Socket Notification Apis"
 *
 * These Apis are used by ISC to manage notification registration from Manager Plugin.
 * Based on Registration Manager will notify ISC of any Domain/Policy changes.
 * This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#getNotificationType()} returns TRANSIENT_WEB_SOCKET.
 *
 */
public interface ManagerWebSocketNotificationApi extends AutoCloseable {

    /**
     * @return Port Number where server is listening to Web Socket Connection
     */
    int getPort();

    /**
     * @return provides a URL which ISC will call to connect to Web Socket Server for notifications
     *         e.g. ws://IP:port or wss://IP:port
     */
    String getUrl();

    /**
     * @return true if server supports HTTPS Web Socket Communication
     */
    boolean isHttps();

    /**
     * @return Provides additional handshake parameter. Can provide api keys or session Ids etc.
     */
    String getHandshakeParameters();

    /**
     * This will logout existing Web Socket Connection. No-op if connection does not exist
     *
     * @throws Exception
     */
    void logout() throws Exception;

    /**
     *
     * ISC will call this method to subscribe Notifications e.g. Policy, Domain etc..
     *
     * @param session
     *            web socket session. {@link Session}
     * @throws IOException
     */
    void subscribe(Session session) throws IOException;

    /**
     * @param message
     *            This helper can be used to re-interpret incoming message or to even change message format if
     *            necessary.
     * @return
     *         ManagerChangeNotification object to notify ISC of any changes. {@link MgrChangeNotification}
     */
    MgrChangeNotification translateMessage(String message);

}
