package com.intelsecurity.isc.plugin.manager.api;

import java.io.IOException;

import javax.websocket.Session;

import com.intelsecurity.isc.plugin.manager.element.MgrChangeNotification;

public interface ManagerWebSocketNotificationApi extends AutoCloseable {

    public int getPort();

    public String getUrl();

    public boolean isHttps();

    public String getHandshakeParameters();

    public void logout() throws Exception;

    public void subscribe(Session session) throws IOException;

    public MgrChangeNotification translateMessage(String message);

}
