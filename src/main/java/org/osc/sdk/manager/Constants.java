package org.osc.sdk.manager;

public class Constants {
    /**
     * The name of the plugin.
     */
    public static final String PLUGIN_NAME = "osc.plugin.name";

    /**
     * The name of the vendor that provides the plugin.
     */
    public static final String VENDOR_NAME = "osc.plugin.vendor_name";

    /**
     * The name of the service managed by this security manager.
     */
    public static final String SERVICE_NAME = "osc.plugin.service_name";

    /**
     * The name of the service managed by this security manager to be used when propagated to external systems.
     */
    public static final String EXTERNAL_SERVICE_NAME = "osc.plugin.external_service_name";

    /**
     * The type of authentication supported by the security manager.
     */
    public static final String AUTHENTICATION_TYPE = "osc.plugin.manager.authentication_type";

    /**
     * The type of communication used by the security manager to contact OSC.
     */
    public static final String NOTIFICATION_TYPE = "osc.plugin.manager.notification_type";

    /**
     * Indicates whether the security manager supports security group constructs and is capable of synchronizing it with OSC.
     */
    public static final String SYNC_SECURITY_GROUP = "osc.plugin.manager.sync_security_group";

    /**
     * Indicates whether the security manager can provide the status of the devices.
     */
    public static final String PROVIDE_DEVICE_STATUS = "osc.plugin.manager.provide_device_status";

    /**
     * Indicates whether the security manager can synchronize policy mapping with OSC.
     */
    public static final String SYNC_POLICY_MAPPING = "osc.plugin.manager.sync_policy_mapping";
}
