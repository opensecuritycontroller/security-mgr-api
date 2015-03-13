package com.intelsecurity.isc.manager.plugin;

public enum ManagerAuthenticationType {
    BASIC_AUTH("BASIC_AUTH"),
    KEY_AUTH("KEY_AUTH");

    private final String text;

    private ManagerAuthenticationType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
