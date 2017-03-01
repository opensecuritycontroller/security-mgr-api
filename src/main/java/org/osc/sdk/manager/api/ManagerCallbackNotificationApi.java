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

import org.osc.sdk.manager.element.ManagerNotificationRegistrationElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Callback Notification Apis".
 * These Apis are used by ISC to manage notification registration from Manager Plugin.
 * Based on Registration Manager will notify ISC of any Domain/Policy changes
 * This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#getNotificationType()} returns CALLBACK_URL.
 */
@ConsumerType
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
    String createDomainNotificationRegistration(Integer port, String username, String password)
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
    void updateDomainNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    /**
     *
     * This Api is used to query Domain Notification Registration Attributes from Manager Connector
     *
     * @return {@link ManagerNotificationRegistrationElement}
     * @throws Exception
     */
    ManagerNotificationRegistrationElement getDomainNotificationRegistration() throws Exception;

    /**
     *
     * Deletes existing Domain Notification Registration.
     * Once deleted ISC will no longer receive any Domain change Notifications.
     *
     * @throws Exception
     */
    void deleteRegisteredDomain() throws Exception;

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
    String createPolicyGroupNotificationRegistration(Integer port, String username, String password)
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
    void updatePolicyGroupNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    /**
     *
     * This Api is used to query Policy Notification Registration Attributes from Manager Connector
     *
     * @return {@link ManagerNotificationRegistrationElement}
     * @throws Exception
     */
    ManagerNotificationRegistrationElement getPolicyGroupNotificationRegistration() throws Exception;

    /**
     *
     * Deletes existing Policy Notification Registration.
     * Once deleted ISC will no longer receive any Policy change Notifications.
     *
     * @throws Exception
     */
    void deleteRegisteredPolicyGroup() throws Exception;

    @Override
    void close();
}
