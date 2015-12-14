package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Notification Registration"
 */
public interface ManagerNotificationRegistrationElement {
    /**
     * @return
     *         Management IP Address of ISC
     */
    public String getIpAddress();

    /**
     * @return
     *         ISC Port number
     */
    public Integer getPort();

    /**
     * @return
     *         User name which will be used for authenticate with ISC
     */
    public String getUsername();

    /**
     * @return
     *         User password which will be used to authenticate with ISC
     */
    public String getPassword();

    /**
     * @return
     *         URL to be used when notifying to ISC
     */
    public String getRelativeURL();

    /**
     * @return
     *         Previously Known IP Address of ISC
     */
    public String getOldIpAddress();

    /**
     * @return
     *         True if already registered, False otherwise
     * 
     */
    public boolean isEmpty();
}
