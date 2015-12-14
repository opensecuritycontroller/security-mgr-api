package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Connector"
 */

public interface ApplianceManagerConnectorElement {

    /**
     * Get Manager Connector name
     * 
     * @return
     *         String given by user for Connector name
     */
    public String getName();

    /**
     * Get Manager Connector IP Address
     * 
     * @return
     *         String given by user for Connector IP
     */
    public String getIpAddress();

    /**
     * If manager authentication method is RESTful BASIC_AUTH, this return the username to use for connection
     * 
     * @return
     *         Manager Connector RESTful BASIC_AUTH username
     */
    public String getUsername();

    /**
     * If manager authentication method is RESTful BASIC_AUTH, this return the password to use for connection
     * 
     * @return
     *         Manager Connector RESTful BASIC_AUTH password (in the clear)
     */
    public String getPassword();

    /**
     * If manager authentication method is RESTful KEY, this return the key to use for connection
     * 
     * @return
     *         Manager Connector RESTful KEY (in the clear)
     */
    public String getApiKey();

    /**
     * Return manager type used to register the manager plugin
     * 
     * @return
     *         Unique String representing manager plugin name
     */
    public ManagerTypeElement getManagerType();

    /**
     * If Manager Notification method is CALLBACK_URL, returns the last known ISC notification ip address known by the
     * manager. This is needed so that we can communicate to the MC when our IP changes to update their notification
     * mechanism instead of adding new notification registrations Can be null/empty.
     * 
     * @return
     *         The last known Notification IP Address
     */
    public String getLastKnownNotificationIpAddress();

    /**
     * In cases where appliance needs to get the Manager public key, this return public key stored in ISC
     * 
     * @return
     *         Opaque array of bytes representing the public key.
     */
    public byte[] getPublicKey();

}
