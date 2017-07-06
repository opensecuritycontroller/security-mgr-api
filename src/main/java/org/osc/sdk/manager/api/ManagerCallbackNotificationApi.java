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

import org.osc.sdk.manager.ManagerNotificationSubscriptionType;
import org.osc.sdk.manager.element.ManagerNotificationRegistrationElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface defines the operations used by OSC to manage callback
 * notification registration.
 * <p>
 * Based on the registration the manager will notify OSC of any domain or policy
 * changes.
 * <p>
 * This API is optional and needs to be implemented only by managers
 * with notification type {@link ManagerNotificationSubscriptionType#CALLBACK_URL}.
 */
@ConsumerType
public interface ManagerCallbackNotificationApi extends AutoCloseable {

    /**
     * Creates a domain notification registration.
     *
     * @param port  the port number to be used when performing the callback
     * @param username  the user name to be used when performing the callback
     * @param password  the password to be used when performing the callback
     * @return the identifier of the registration defined by the security manager
     * @throws Exception upon failure
     */
    String createDomainNotificationRegistration(Integer port, String username, String password)
            throws Exception;

    /**
     * Updates a domain notification registration.
     *
     * @param oldIpAddress  the previous IP address associated with the registration
     * @param port  the new port number to be used when performing the callback
     * @param username  the new user name to be used when performing the callback
     * @param password  the new password to be used when performing the callback
     * @throws Exception upon failure
     */
    void updateDomainNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    /**
     * Retrieves the domain notification registration attributes from the security manager
     *
     * @return the notification registration information from the security manager
     * @throws Exception upon failure
     */
    ManagerNotificationRegistrationElement getDomainNotificationRegistration() throws Exception;

    /**
     * Deletes the existing domain notification registration.
     * <p>
     * Once deleted OSC will no longer receive any domain change notifications.
     *
     * @throws Exception upon failure
     */
    void deleteRegisteredDomain() throws Exception;

    /**
     * Creates a policy group notification registration.
     *
     * @param port  the port number to be used when performing the callback
     * @param username  the user name to be used when performing the callback
     * @param password  the password to be used when performing the callback
     * @return the identifier of the registration defined by the security manager
     * @throws Exception upon failure
     */
    String createPolicyGroupNotificationRegistration(Integer port, String username, String password)
            throws Exception;

    /**
     * Updates a policy group notification registration.
     *
     * @param oldIpAddress  the previous IP address associated with the registration
     * @param port  the new port number to be used when performing the callback
     * @param username  the new user name to be used when performing the callback
     * @param password  the new password to be used when performing the callback
     * @throws Exception upon failure
     */
    void updatePolicyGroupNotificationRegistration(String oldIpAddress, Integer port, String username,
            String password) throws Exception;

    /**
     * Retrieves the policy group notification registration attributes from the security manager
     *
     * @return the notification registration information from the security manager
     * @throws Exception upon failure
     */
    ManagerNotificationRegistrationElement getPolicyGroupNotificationRegistration() throws Exception;

    /**
     * Deletes the existing policy group notification registration.
     * <p>
     * Once deleted OSC will no longer receive any policy group change notifications.
     *
     * @throws Exception upon failure
     */
    void deleteRegisteredPolicyGroup() throws Exception;

    @Override
    void close();
}
