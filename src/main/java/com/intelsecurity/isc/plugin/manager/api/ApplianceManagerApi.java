package com.intelsecurity.isc.plugin.manager.api;

import com.intelsecurity.isc.plugin.manager.ManagerAuthenticationType;
import com.intelsecurity.isc.plugin.manager.ManagerNotificationSubscriptionType;
import com.intelsecurity.isc.plugin.manager.element.ApplianceManagerConnectorElement;
import com.intelsecurity.isc.plugin.manager.element.VirtualSystemElement;

/**
 * This documents "Manager Apis" used by ISC to communicate with registered Managers
 */
public interface ApplianceManagerApi {

    //TODO:Future add typed exceptions...

    /**
     * @param vs
     *            Virtual System Element {@link VirtualSystemElement}
     * @return Device Api
     * @throws Exception
     */
    public abstract ManagerDeviceApi createManagerDeviceApi(VirtualSystemElement vs) throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Policy Api
     * @throws Exception
     */
    public abstract ManagerPolicyApi createManagerPolicyApi(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Domain Api
     * @throws Exception
     */
    public abstract ManagerDomainApi createManagerDomainApi(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * 
     * Implementation of this method is required if Manager uses Web Socket Subscription Type for Notifications
     * 
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Web Socket Notification Api
     * @throws Exception
     */
    public abstract ManagerWebSocketNotificationApi createManagerWebSocketNotificationApi(
            ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Callback Notification Api
     * @throws Exception
     */
    public abstract ManagerCallbackNotificationApi createManagerCallbackNotificationApi(
            ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param vs
     *            Virtual System Element {@link VirtualSystemElement}
     * @return Job Notification Api
     * @throws Exception
     */
    public abstract IscJobNotificationApi createIscJobNotificationApi(VirtualSystemElement vs) throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Public key (byte array)
     * @throws Exception
     */
    public abstract byte[] getPublicKey(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @return Manager's Name
     *         e.g. returns "ISM" for Intel Security Manager Plugin
     */
    public abstract String getName();

    /**
     * @return Manager Plugin Version e.g. "1.0"
     */
    public abstract String getVersion();

    /**
     * @return What kind of service this manager provides e.g NGFW, IPS etc.
     */
    public abstract String getServiceName();

    /**
     * @return Name of service provided by Manager Plugin. This one is dictated by NSX and will appear in in NSX service
     *         definitions page.
     */
    public abstract String getNsxServiceName();

    /**
     * @param ipAddress
     *            IP Address of the Manager
     * @return
     *         URL to launch Management Console
     */
    public abstract String getManagerUrl(String ipAddress);

    /**
     * @return Authentication type supported by this Manager {@link ManagerAuthenticationType}
     */
    public abstract ManagerAuthenticationType getAuthenticationType();

    /**
     * @return True if Manager is capable of sending Notifications to ISC.
     */
    public abstract boolean isNotificationSupported();

    /**
     * @return Subscription type supported by this Manager {@link ManagerNotificationSubscriptionType}
     */
    public abstract ManagerNotificationSubscriptionType getNotificationType();

    /**
     * @return True if manager supports Security Group constructs and is capable of Synchronizing it with ISC
     */
    public abstract boolean isSecurityGroupSyncSupport();

}
