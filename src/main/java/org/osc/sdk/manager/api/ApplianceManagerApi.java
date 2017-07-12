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

import org.osc.sdk.manager.Constants;
import org.osc.sdk.manager.ManagerNotificationSubscriptionType;
import org.osc.sdk.manager.element.ApplianceManagerConnectorElement;
import org.osc.sdk.manager.element.VirtualSystemElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface represents the main entry point for all the interactions with the security manager.
 * It provides a way for OSC to instantiate the other security manager APIs and basic information like
 * the status of the manager and its URL.
 * <p>
 * Classes implementing this interface must be published through the OSGi service registry and must
 * contain the following REQUIRED properties:
 * <ul>
 * <li> {@link Constants#PLUGIN_NAME}
 * <li> {@link Constants#AUTHENTICATION_TYPE}
 * <li> {@link Constants#NOTIFICATION_TYPE}
 * <li> {@link Constants#SERVICE_NAME}
 * <li> {@link Constants#EXTERNAL_SERVICE_NAME}
 * <li> {@link Constants#VENDOR_NAME}
 * <li> {@link Constants#PROVIDE_DEVICE_STATUS}
 * <li> {@link Constants#SYNC_POLICY_MAPPING}
 * <li> {@link Constants#SYNC_SECURITY_GROUP}
 * </ul>
 */
@ConsumerType
public interface ApplianceManagerApi {

    //TODO:Future add typed exceptions...

    /**
     * @param mc  provides information needed to connect with the security manager
     * @param vs  provides context information of the virtual system, see {@link VirtualSystemElement}
     * @return the APIs used by OSC to manage devices
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerDeviceApi createManagerDeviceApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs)
            throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @param vs  provides context information of the virtual system, see {@link VirtualSystemElement}
     * @return the APIs used by OSC to manage security group interfaces
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerSecurityGroupInterfaceApi createManagerSecurityGroupInterfaceApi(ApplianceManagerConnectorElement mc,
            VirtualSystemElement vs) throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @param vs  provides context information of the virtual system, see {@link VirtualSystemElement}
     * @return the APIs used by OSC to manage security groups
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerSecurityGroupApi createManagerSecurityGroupApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs)
            throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @return the APIs used by OSC to retrieve security policies
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerPolicyApi createManagerPolicyApi(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @return the APIs used by OSC to retrieve domains from the security managers
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerDomainApi createManagerDomainApi(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @param vs  provides context information of the virtual system, see {@link VirtualSystemElement}
     * @return the APIs used by OSC to manage device members
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerDeviceMemberApi createManagerDeviceMemberApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs) throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @return the APIs used by OSC to manage notification registration
     *
     * @throws UnsupportedOperationException if the notification type is
     * not {@link ManagerNotificationSubscriptionType#TRANSIENT_WEB_SOCKET}
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerWebSocketNotificationApi createManagerWebSocketNotificationApi(ApplianceManagerConnectorElement mc)
            throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @return the APIs used by OSC to manage notification registration
     *
     * @throws UnsupportedOperationException if the notification type is
     * not {@link ManagerNotificationSubscriptionType#CALLBACK_URL}
     * @throws Exception when an instance of the API cannot be created
     */
    ManagerCallbackNotificationApi createManagerCallbackNotificationApi(ApplianceManagerConnectorElement mc)
            throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @param vs  provides context information of the virtual system, see {@link VirtualSystemElement}
     * @return the APIs used by OSC to report job and task events
     * @throws Exception when an instance of the API cannot be created
     */
    IscJobNotificationApi createIscJobNotificationApi(ApplianceManagerConnectorElement mc, VirtualSystemElement vs)
            throws Exception;

    /**
     * @param mc  provides information needed to connect with the security manager
     * @return the security manager public key
     * @throws Exception when an instance of the API cannot be created
     */
    byte[] getPublicKey(ApplianceManagerConnectorElement mc) throws Exception;

    /**
     * @param ipAddress  the IP address of the security manager
     * @return the URL for the security manager management console
     */
    String getManagerUrl(String ipAddress);

    /**
     * @param mc  provides information needed to connect with the security manager
     * @throws Exception if the security manager cannot be reached or is not functional
     */
    void checkConnection(ApplianceManagerConnectorElement mc) throws Exception;

    // TODO: Create API's to retrieve device instance status by id
}
