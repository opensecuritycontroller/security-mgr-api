package com.intelsecurity.isc.manager.plugin.api;

import javax.websocket.Session;

import com.intelsecurity.isc.element.MgrChangeNotification;

public interface ManagerWebSocketNotificationApi {

    public int getPort();

    public String getUrl();

    public boolean isHttps();

    public void login();

    public void subscribe(Session session);

    public MgrChangeNotification translateMessage(String message);

}
