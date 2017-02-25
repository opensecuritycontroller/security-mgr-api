/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.sdk.manager.api;

import org.osc.sdk.manager.ManagerAuthenticationType;
import org.osc.sdk.manager.ManagerNotificationSubscriptionType;
import org.osc.sdk.manager.element.ApplianceManagerConnectorElement;
import org.osc.sdk.manager.element.VirtualSystemElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Apis" used by ISC to communicate with registered Managers. The virtual system element ->
 * Distributed appliance Element -> Manager connector Element does NOT contain the plain Password.
 */
@ConsumerType
public interface ApplianceManagerApi {

    //TODO:Future add typed exceptions...

    /**
     * @param mc
     *            the manager connector element.
     * @param vs
     *            Virtual System Element {@link VirtualSystemElement}.
     * @return Device Api
     * @throws Exception
     */
    ManagerDeviceApi createManagerDeviceApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs)
            throws Exception;

    /**
     * @param mc
     *            the manager connector element.
     * @param vs
     *            Virtual System Element {@link VirtualSystemElement}.
     * @return ManagerSecurityGroupInterfaceApi Api. It can return null if {@code #isPolicyMappingSupported()} returns false.
     * @throws Exception
     */
    ManagerSecurityGroupInterfaceApi createManagerSecurityGroupInterfaceApi(ApplianceManagerConnectorElement mc,
            VirtualSystemElement vs) throws Exception;

    /**
     * @param mc
     *            the manager connector element.
     * @param vs
     *            Virtual System Element {@link VirtualSystemElement}.
     * @throws Exception
     */
    ManagerSecurityGroupApi createManagerSecurityGroupApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs)
            throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Policy Api
     * @throws Exception
     */
    ManagerPolicyApi createManagerPolicyApi(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Domain Api. It can be null if {@code #isPolicyMappingSupported()} returns false.
     * @throws Exception
     */
    ManagerDomainApi createManagerDomainApi(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Agent Api. It can be null if {@code #isAgentSupported()} returns false.
     * @throws Exception
     */
    ManagerDeviceMemberApi createManagerDeviceMemberApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs) throws Exception;

    /**
     *
     * Implementation of this method is required if Manager uses Web Socket Subscription Type for Notifications
     *
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Web Socket Notification Api
     * @throws UnsupportedOperationException
     *             if WebSocket Notification is not supported
     * @throws Exception
     */
    ManagerWebSocketNotificationApi createManagerWebSocketNotificationApi(ApplianceManagerConnectorElement mc)
            throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Callback Notification Api
     * @throws UnsupportedOperationException
     *             if Callback Notification is not supported
     * @throws Exception
     */
    ManagerCallbackNotificationApi createManagerCallbackNotificationApi(ApplianceManagerConnectorElement mc)
            throws Exception;

    /**
     * @param mc
     *            the manager connector element. RESTful BASIC_AUTH password in the CLEAR.
     * @param vs
     *            Virtual System Element {@link VirtualSystemElement}
     * @return Job Notification Api
     * @throws Exception
     */
    IscJobNotificationApi createIscJobNotificationApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs)
            throws Exception;

    /**
     * @param mc
     *            Manager Connector Element {@link ApplianceManagerConnectorElement}
     * @return Public key (byte array)
     * @throws Exception
     */
    byte[] getPublicKey(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @return Manager's Name
     *         e.g. returns "ISM" for Intel Security Manager Plugin
     */
    String getName();

    /**
     * @return Vendor Name e.g. "Intel Security"
     */
    String getVendorName();

    /**
     * @return Manager Plugin Version e.g. "1.0"
     */
    String getVersion();

    /**
     * @return What kind of service this manager provides e.g NGFW, IPS etc.
     */
    String getServiceName();

    /**
     * @return Name of service provided by Manager Plugin. This one is dictated by NSX and will appear in in NSX service
     *         definitions page.
     */
    String getNsxServiceName();

    /**
     * @param ipAddress
     *            IP Address of the Manager
     * @return
     *         URL to launch Management Console
     */
    String getManagerUrl(String ipAddress);

    /**
     * @return Authentication type supported by this Manager {@link ManagerAuthenticationType}
     */
    ManagerAuthenticationType getAuthenticationType();

    /**
     * @return Subscription type supported by this Manager {@link ManagerNotificationSubscriptionType}
     */
    ManagerNotificationSubscriptionType getNotificationType();

    /**
     * @return True if manager supports Security Group constructs and is capable of Synchronizing it with ISC
     */
    boolean isSecurityGroupSyncSupport();

    void checkConnection(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * Returns True if ISC appliances have ISC agents running on the instance. False otherwise
     *
     */
    boolean isAgentManaged();

    /**
     * Returns True if the appliance manager supports policy mapping. False otherwise.
     * The value returned by this method should not change at runtime.
     */
    boolean isPolicyMappingSupported();

    // TODO: Future For non-agent managed, create API's to retrive status(es) by id
}
