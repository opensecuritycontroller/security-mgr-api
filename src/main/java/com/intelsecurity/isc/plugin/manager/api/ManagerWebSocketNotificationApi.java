package com.intelsecurity.isc.plugin.manager.api;

import java.io.IOException;

import javax.websocket.Session;

import com.intelsecurity.isc.plugin.manager.element.MgrChangeNotification;

public interface ManagerWebSocketNotificationApi {

    public int getPort();

    public String getUrl();

    public boolean isHttps();

    public void login();

    public void subscribe(Session session) throws IOException;

    public MgrChangeNotification translateMessage(String message);

}
