package com.intelsecurity.isc.plugin.manager;

public enum ManagerNotificationSubscriptionType {
    TRANSIENT_WEB_SOCKET("TRANSIENT_WEB_SOCKET"),
    PERSISTED_URL("PERSISTED_URL");

    private final String text;

    private ManagerNotificationSubscriptionType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
