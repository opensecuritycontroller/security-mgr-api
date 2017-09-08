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

import java.util.List;

import org.osc.sdk.manager.Constants;
import org.osc.sdk.manager.element.ManagerSecurityGroupInterfaceElement;
import org.osc.sdk.manager.element.SecurityGroupInterfaceElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface documents the operations used by OSC to manage security group interfaces.
 * <p>
 * This API is required only by security managers configured to sync policy mappings,
 * see {@link Constants#SYNC_POLICY_MAPPING}.
 */
@ConsumerType
public interface ManagerSecurityGroupInterfaceApi extends AutoCloseable {

    /**
     * Creates a security group interface within context of the current virtual system
     *
     * @param sgiElement  the information needed to create a security group interface
     * @return the identifier of the security group interface defined by the security manager
     *
     * @throws Exception upon failure
     */
    String createSecurityGroupInterface(SecurityGroupInterfaceElement sgiElement) throws Exception;

    /**
     * Updates a security group interface within context of the current virtual system
     *
     * @param sgiElement  the information needed to update a security group interface
     *
     * @throws Exception upon failure
     */
    void updateSecurityGroupInterface(SecurityGroupInterfaceElement sgiElement) throws Exception;

    /**
     * Deletes a security group interface within context of the current virtual system.
     *
     * @param id the identifier of the security group interface to be deleted
     * @throws Exception upon failure
     */
    void deleteSecurityGroupInterface(String id) throws Exception;

    /**
     * Retrieves the security group interface by its identifier within the context of the current virtual system.
     *
     * @param id  the identifier of the security group interface
     * @return the security group interface, null if not found
     * @throws Exception upon failure
     */
    ManagerSecurityGroupInterfaceElement getSecurityGroupInterfaceById(String id) throws Exception;

    /**
     * Retrieves the security group interface by its name within the context of the current virtual system.
     *
     * @param name  the name of the security group interface
     * @return the security group interface, null if not found
     * @throws Exception upon failure
     */
    String findSecurityGroupInterfaceByName(String name) throws Exception;

    /**
     * Gets all the security group interfaces within the context of the current virtual system.
     *
     * @return the collection of security group interfaces.
     * @throws Exception upon failure
     */
    List<? extends ManagerSecurityGroupInterfaceElement> listSecurityGroupInterfaces() throws Exception;

    @Override
    void close();
}
