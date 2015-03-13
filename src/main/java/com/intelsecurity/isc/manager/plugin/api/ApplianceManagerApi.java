package com.intelsecurity.isc.manager.plugin.api;

import com.intelsecurity.isc.element.ApplianceManagerConnectorElement;
import com.intelsecurity.isc.element.VirtualSystemElement;
import com.intelsecurity.isc.manager.plugin.ManagerAuthenticationType;
import com.intelsecurity.isc.manager.plugin.ManagerNotificationSubscriptionType;

public interface ApplianceManagerApi {

    public abstract ManagerDeviceApi createManagerDeviceApi(VirtualSystemElement vs) throws Exception;

    public abstract ManagerPolicyApi createManagerPolicyApi(ApplianceManagerConnectorElement mc) throws Exception;

    public abstract ManagerDomainApi createManagerDomainApi(ApplianceManagerConnectorElement mc) throws Exception;

    public abstract ManagerWebSocketNotificationApi createManagerWebSocketNotificationApi(
            ApplianceManagerConnectorElement mc) throws Exception;

    public abstract ManagerUrlNotificationApi createManagerUrlNotificationApi(ApplianceManagerConnectorElement mc)
            throws Exception;

    public abstract IscJobNotificationApi createIscJobNotificationApi(VirtualSystemElement vs)
            throws Exception;

    public abstract byte[] getPublicKey(ApplianceManagerConnectorElement mc) throws Exception;

    public abstract String getName();

    public abstract String getVersion();

    public abstract String getServiceName();

    public abstract String getNsxServiceName();

    public abstract String getManagerUrl(String ipAddress);

    public abstract ManagerAuthenticationType getAuthenticationType();

    public abstract ManagerNotificationSubscriptionType getNotificationType();

}
