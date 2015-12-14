package com.intelsecurity.isc.plugin.manager;

/**
 * This documents "Authentication Types". In this version we support two different types of authentication
 * Base Auth uses username and password
 * Key_Auth uses API Key
 */
public enum ManagerAuthenticationType {
    BASIC_AUTH("BASIC_AUTH"), KEY_AUTH("KEY_AUTH");

    private final String text;

    private ManagerAuthenticationType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
