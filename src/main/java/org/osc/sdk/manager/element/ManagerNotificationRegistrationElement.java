package org.osc.sdk.manager.element;

/**
 * This documents "Manager Notification Registration"
 */
public interface ManagerNotificationRegistrationElement {
    /**
     * @return
     *         Management IP Address of ISC
     */
    String getIpAddress();

    /**
     * @return
     *         ISC Port number
     */
    Integer getPort();

    /**
     * @return
     *         User name which will be used for authenticate with ISC
     */
    String getUsername();

    /**
     * @return
     *         User password which will be used to authenticate with ISC
     */
    String getPassword();

    /**
     * @return
     *         URL to be used when notifying to ISC
     */
    String getRelativeURL();

    /**
     * @return
     *         Previously Known IP Address of ISC
     */
    String getOldIpAddress();

    /**
     * @return
     *         True if already registered, False otherwise
     *
     */
    boolean isEmpty();
}
