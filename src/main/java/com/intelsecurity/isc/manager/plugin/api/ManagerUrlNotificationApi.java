package com.intelsecurity.isc.manager.plugin.api;

import com.intelsecurity.isc.manager.plugin.element.ManagerNotificationRegistrationElement;

public interface ManagerUrlNotificationApi {

    public abstract String createDomainNotificationRegistration(Integer port, String username, String password)
            throws Exception;

    public abstract void updateDomainNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    public abstract ManagerNotificationRegistrationElement getDomainNotificationRegistration() throws Exception;

    public abstract void deleteRegisteredDomain() throws Exception;

    public abstract String createPolicyGroupNotificationRegistration(Integer port, String username, String password)
            throws Exception;

    public abstract void updatePolicyGroupNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    public abstract ManagerNotificationRegistrationElement getPolicyGroupNotificationRegistration() throws Exception;

    public abstract void deleteRegisteredPolicyGroup() throws Exception;

    public abstract void close();
}
