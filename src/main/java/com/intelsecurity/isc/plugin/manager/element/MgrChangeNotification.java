package com.intelsecurity.isc.plugin.manager.element;

/**
 * This provides functionality needed to support Manager element change Notifications.
 */
public class MgrChangeNotification {
    /**
     * This documents "Manager Object Types"
     */
    public enum MgrObjectType {
        POLICY, DOMAIN
    }

    /**
     * This documents "Object State Change"
     */
    public enum ChangeType {
        ADDED, UPDATED, DELETED
    }

    private final ChangeType changeType;
    private final MgrObjectType objectType;
    private final String objectId;

    public MgrChangeNotification(ChangeType changeType, MgrObjectType objectType, String objectId) {
        this.changeType = changeType;
        this.objectType = objectType;
        this.objectId = objectId;
    }

    /**
     * @return
     *         Type of change Notification Registered. {@link ChangeType}
     */
    public ChangeType getChangeType() {
        return changeType;
    }

    /**
     * @return
     *         Type of Object which is in context of this change Notification. {@link MgrObjectType}
     */
    public MgrObjectType getObjectType() {
        return objectType;
    }

    /**
     * @return
     *         Object Id as a String
     */
    public String getObjectId() {
        return objectId;
    }

    @Override
    public String toString() {
        return "MgrChangeNotification [changeType=" + changeType + ", objectType=" + objectType + ", objectId="
                + objectId + "]";
    }

}
