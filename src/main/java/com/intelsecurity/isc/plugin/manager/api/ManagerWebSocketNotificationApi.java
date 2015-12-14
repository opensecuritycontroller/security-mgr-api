package com.intelsecurity.isc.plugin.manager.api;

import java.io.IOException;

import javax.websocket.Session;

import com.intelsecurity.isc.plugin.manager.element.MgrChangeNotification;

/**
 * This documents "Web Socket Notification Apis"
 * 
 * These Apis are used by ISC to manager notification registration from Manager Plugin.
 * Based on Registration Manager will notify ISC of any Domain/Policy changes
 */
public interface ManagerWebSocketNotificationApi extends AutoCloseable {

    /**
     * @return Port Number where server is listening to Web Socket Connection
     */
    public int getPort();

    /**
     * @return provides a URL which ISC will call to connect to Web Socket Server for notifications
     *         e.g. ws://IP:port or wss://IP:port
     */
    public String getUrl();

    /**
     * @return true if server supports HTTPS Web Socket Communication
     */
    public boolean isHttps();

    /**
     * @return Provides additional handshake parameter. Can provide api keys or session Ids etc.
     */
    public String getHandshakeParameters();

    /**
     * This will logout existing Web Socket Connection. No-op if connection does not exist
     * 
     * @throws Exception
     */
    public void logout() throws Exception;

    /**
     * 
     * ISC will call this method to subscribe Notifications e.g. Policy, Domain etc..
     * 
     * @param session
     *            web socket session. {@link Session}
     * @throws IOException
     */
    public void subscribe(Session session) throws IOException;

    /**
     * @param message
     *            This helper can be used to re-interpret incoming message or to even change message format if
     *            necessary.
     * @return
     *         ManagerChangeNotification object to notify ISC of any changes. {@link MgrChangeNotification}
     */
    public MgrChangeNotification translateMessage(String message);

}
