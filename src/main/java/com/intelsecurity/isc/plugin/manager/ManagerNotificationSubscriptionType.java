package com.intelsecurity.isc.plugin.manager;

/**
 * This documents "Subscription Types" for sending notifications to ISC
 */
public enum ManagerNotificationSubscriptionType {
    TRANSIENT_WEB_SOCKET("TRANSIENT_WEB_SOCKET"), CALLBACK_URL("CALLBACK_URL"), NONE("NONE");

    private final String text;

    private ManagerNotificationSubscriptionType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
