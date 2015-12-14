package com.intelsecurity.isc.plugin.manager.api;

import com.intelsecurity.isc.plugin.manager.element.ManagerNotificationRegistrationElement;

/**
 * This documents "Manager Callback Notification Apis".
 * These Apis are used by ISC to manager notification registration from Manager Plugin.
 * Based on Registration Manager will notify ISC of any Domain/Policy changes
 */
public interface ManagerCallbackNotificationApi extends AutoCloseable {

    /**
     * 
     * Domain change Notification registration.
     * 
     * @param port
     *            Port Number
     * @param username
     *            User Name
     * @param password
     *            Password
     * @return
     *         String "Resource ID" created as a part of Registration
     * @throws Exception
     */
    public abstract String createDomainNotificationRegistration(Integer port, String username, String password)
            throws Exception;

    /**
     * 
     * This Api is used to update Domain Notification registration attributes
     * 
     * @param oldIpAddress
     *            Previously registered IP Address used to identity the registration which Manager should Update.
     * @param port
     *            new port number
     * @param
     *        new user name
     * @param
     *        new password
     * @throws Exception
     */
    public abstract void updateDomainNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    /**
     * 
     * This Api is used to query Domain Notification Registration Attributes from Manager Connector
     * 
     * @return {@link ManagerNotificationRegistrationElement}
     * @throws Exception
     */
    public abstract ManagerNotificationRegistrationElement getDomainNotificationRegistration() throws Exception;

    /**
     * 
     * Deletes existing Domain Notification Registration.
     * Once deleted ISC will no longer receive any Domain change Notifications.
     * 
     * @throws Exception
     */
    public abstract void deleteRegisteredDomain() throws Exception;

    /**
     * 
     * Policy change Notification registration.
     * 
     * @param port
     *            Port Number
     * @param username
     *            User Name
     * @param password
     *            Password
     * @return String
     *         String "Resource ID" created as a part of Registration
     * @throws Exception
     */
    public abstract String createPolicyGroupNotificationRegistration(Integer port, String username, String password)
            throws Exception;

    /**
     * 
     * This Api is used to update Policy Notification registration attributes
     * 
     * @param oldIpAddress
     *            Previously registered IP Address used to identity the registration which Manager should Update.
     * @param port
     *            new port number
     * @param
     *        new user name
     * @param
     *        new password
     * @throws Exception
     */
    public abstract void updatePolicyGroupNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    /**
     * 
     * This Api is used to query Policy Notification Registration Attributes from Manager Connector
     * 
     * @return {@link ManagerNotificationRegistrationElement}
     * @throws Exception
     */
    public abstract ManagerNotificationRegistrationElement getPolicyGroupNotificationRegistration() throws Exception;

    /**
     * 
     * Deletes existing Policy Notification Registration.
     * Once deleted ISC will no longer receive any Policy change Notifications.
     * 
     * @throws Exception
     */
    public abstract void deleteRegisteredPolicyGroup() throws Exception;

    @Override
    public abstract void close();
}
