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

import org.osc.sdk.manager.element.ManagerSecurityGroupInterfaceElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Security Group Interface Apis" (Security Group -> Policy mapping).
 * This API is optional and needs to be implemented if {@code ApplianceManagerApi#isPolicyMappingSupported()} returns true.
 */
@ConsumerType
public interface ManagerSecurityGroupInterfaceApi extends AutoCloseable {

    /**
     * Create security group interface within context of VS device container
     *
     * @param securityGroup
     * @return
     *         Security Group Interface Id (String) is successfully created
     *
     * @throws Exception
     */
    String createSecurityGroupInterface(String name, String policyId, String tag) throws Exception;

    /**
     * @param id
     *            The security group id to update
     * @param name
     *            Security Group name
     * @param policyId
     *            Policy Id associated with this Security Group Interface
     * @param tag
     *            Policy Tag binded with this Security Group Interface
     * @throws Exception
     */
    void updateSecurityGroupInterface(String id, String name, String policyId, String tag) throws Exception;

    /**
     * Delete security group interface within context of VS device container
     *
     * @param id
     *            The id of the security group interface to delete
     * @throws Exception
     */
    void deleteSecurityGroupInterface(String id) throws Exception;

    /**
     * Find security group by id within the context of VS device container and and return security group element
     *
     * @param id
     *            The security group id to locate
     * @return
     *         The security group element found. Null if not found. {@link ManagerSecurityGroupInterfaceElement}
     * @throws Exception
     */
    ManagerSecurityGroupInterfaceElement getSecurityGroupInterfaceById(String id) throws Exception;

    /**
     * Locate Security group by name with in the context of VS device container and return unique id if found.
     *
     * @param name
     *            The security group name to locate.
     * @return
     *         The security group id (String).
     * @throws Exception
     */
    String findSecurityGroupInterfaceByName(String name) throws Exception;

    /**
     * Get list of all security group interfaces within the context of the VS device container.
     *
     * @return
     *         The security group element list. List<{@link ManagerSecurityGroupInterfaceElement}>
     * @throws Exception
     */
    List<? extends ManagerSecurityGroupInterfaceElement> listSecurityGroupInterfaces() throws Exception;

    @Override
    void close();
}
