package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Connector"
 */
@ConsumerType
public interface ApplianceManagerConnectorElement {

    /**
     * Get Manager Connector name
     *
     * @return
     *         String given by user for Connector name
     */
    String getName();

    /**
     * Get Manager Connector IP Address
     *
     * @return
     *         String given by user for Connector IP
     */
    String getIpAddress();

    /**
     * If manager authentication method is RESTful BASIC_AUTH, this return the username to use for connection
     *
     * @return
     *         Manager Connector RESTful BASIC_AUTH username
     */
    String getUsername();

    /**
     * If manager authentication method is RESTful BASIC_AUTH, this return the password to use for connection
     *
     * @return
     *         Manager Connector RESTful BASIC_AUTH password (in the clear)
     */
    String getPassword();

    /**
     * If manager authentication method is RESTful KEY, this return the key to use for connection
     *
     * @return
     *         Manager Connector RESTful KEY (in the clear)
     */
    String getApiKey();

    /**
     * Return manager type used to register the manager plugin
     *
     * @return
     *         Unique String representing manager plugin name
     */
    ManagerTypeElement getManagerType();

    /**
     * If Manager Notification method is CALLBACK_URL, returns the last known ISC notification ip address known by the
     * manager. This is needed so that we can communicate to the MC when our IP changes to update their notification
     * mechanism instead of adding new notification registrations Can be null/empty.
     *
     * @return
     *         The last known Notification IP Address
     */
    String getLastKnownNotificationIpAddress();

    /**
     * In cases where appliance needs to get the Manager key, this return key stored in OSC
     *
     * @return
     *         Opaque array of bytes representing the key.
     */
    byte[] getPublicKey();

    /**
     * Provides the IP address of the client application (OSC) hosting the plugin.
     *
     * @return
     *         The IP address of the application (OSC) hosting the plugin.
     */
    String getClientIpAddress();
}
