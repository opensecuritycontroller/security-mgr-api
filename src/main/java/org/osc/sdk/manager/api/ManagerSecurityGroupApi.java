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

import org.osc.sdk.manager.element.ManagerSecurityGroupElement;
import org.osc.sdk.manager.element.SecurityGroupMemberListElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Security Group Apis". This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#isSecurityGroupSyncSupport()} returns true.
 */
@ConsumerType
public interface ManagerSecurityGroupApi extends AutoCloseable {

    /**
     * Create an security group
     *
     * @param name
     *            Name of the security group
     * @param iscId
     *            Unique Identifier (String) representing ISC which is responsible for this Security Group
     * @param memberList
     *            The members within the security group
     *
     * @return
     *         The Manager Id for the newly created Security Group object
     */
    String createSecurityGroup(String name, String iscId, SecurityGroupMemberListElement memberList) throws Exception;

    /**
     * Update an Security Group object
     *
     * @param sgId
     *            The Security Group object id
     * @param name
     *            The updated name of the Security Group object
     * @param memberList
     *            The members within the security group
     */
    void updateSecurityGroup(String sgId, String name, SecurityGroupMemberListElement memberList) throws Exception;

    /**
     * Delete an Security Group object
     *
     * @param sgId
     *            The Security Group object id
     * @throws Exception
     */
    void deleteSecurityGroup(String sgId) throws Exception;

    /**
     * List all security groups
     *
     * @return
     *         List of security groups. List<{@link ManagerSecurityGroupElement}>
     */
    List<? extends ManagerSecurityGroupElement> getSecurityGroupList() throws Exception;

    /**
     * @param sgId
     *            The Security Group object id
     * @return
     *         Security Group Object {@link ManagerSecurityGroupElement}
     * @throws Exception
     */
    ManagerSecurityGroupElement getSecurityGroupById(String sgId) throws Exception;

    @Override
    void close();

}
