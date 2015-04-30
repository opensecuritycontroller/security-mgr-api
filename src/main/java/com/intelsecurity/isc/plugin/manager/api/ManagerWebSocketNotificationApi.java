package com.intelsecurity.isc.plugin.manager.api;

import javax.websocket.Session;

import com.intelsecurity.isc.plugin.manager.element.MgrChangeNotification;

public interface ManagerWebSocketNotificationApi {

    public int getPort();

    public String getUrl();

    public boolean isHttps();

    public void login();

    public void subscribe(Session session);

    public MgrChangeNotification translateMessage(String message);

}
