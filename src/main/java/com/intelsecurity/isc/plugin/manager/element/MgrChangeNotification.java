package com.intelsecurity.isc.plugin.manager.element;

public class MgrChangeNotification {

    public enum MgrObjectType {
        POLICY,
        DOMAIN
    }

    public enum ChangeType {
        ADDED,
        UPDATED,
        DELETED
    }

    private ChangeType changeType;
    private MgrObjectType objectType;
    private String objectId;

    public MgrChangeNotification(ChangeType changeType, MgrObjectType objectType, String objectId) {
        this.changeType = changeType;
        this.objectType = objectType;
        this.objectId = objectId;
    }

    public ChangeType getChangeType() {
        return changeType;
    }

    public MgrObjectType getObjectType() {
        return objectType;
    }

    public String getObjectId() {
        return objectId;
    }

    @Override
    public String toString() {
        return "MgrChangeNotification [changeType=" + changeType + ", objectType=" + objectType + ", objectId="
                + objectId + "]";
    }

}
