package com.intelsecurity.isc.plugin.manager.api;

import com.intelsecurity.isc.plugin.manager.ManagerAuthenticationType;
import com.intelsecurity.isc.plugin.manager.ManagerNotificationSubscriptionType;
import com.intelsecurity.isc.plugin.manager.element.ApplianceManagerConnectorElement;
import com.intelsecurity.isc.plugin.manager.element.VirtualSystemElement;

public interface ApplianceManagerApi {

    public abstract ManagerDeviceApi createManagerDeviceApi(VirtualSystemElement vs) throws Exception;

    public abstract ManagerPolicyApi createManagerPolicyApi(ApplianceManagerConnectorElement mc) throws Exception;

    public abstract ManagerDomainApi createManagerDomainApi(ApplianceManagerConnectorElement mc) throws Exception;

    public abstract ManagerWebSocketNotificationApi createManagerWebSocketNotificationApi(
            ApplianceManagerConnectorElement mc) throws Exception;

    public abstract ManagerUrlNotificationApi createManagerUrlNotificationApi(ApplianceManagerConnectorElement mc)
            throws Exception;

    public abstract IscJobNotificationApi createIscJobNotificationApi(VirtualSystemElement vs) throws Exception;

    public abstract byte[] getPublicKey(ApplianceManagerConnectorElement mc) throws Exception;

    public abstract String getName();

    public abstract String getVersion();

    public abstract String getServiceName();

    public abstract String getNsxServiceName();

    public abstract String getManagerUrl(String ipAddress);

    public abstract ManagerAuthenticationType getAuthenticationType();

    public abstract boolean isNotificationSupported();

    public abstract ManagerNotificationSubscriptionType getNotificationType();

    public abstract boolean isSecurityGroupSyncSupport();

}
