package com.intelsecurity.isc.manager.plugin.element;

public interface ManagerNotificationRegistrationElement {
    public String getIpAddress();

    public Integer getPort();

    public String getUsername();

    public String getPassword();

    public String getRelativeURL();

    public String getOldIpAddress();

    public boolean isEmpty();
}