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
import org.osc.sdk.manager.element.ManagerSecurityGroupElement;
import org.osc.sdk.manager.element.SecurityGroupMemberListElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface documents the operations used by OSC to manage security groups and members.
 * <p>
 * This API is required only by security managers configured to sync security groups,
 * see {@link Constants#SYNC_SECURITY_GROUP}.
 */
@ConsumerType
public interface ManagerSecurityGroupApi extends AutoCloseable {

    /**
     * Creates a security group.
     *
     * @param name the name of the security group
     * @param sgId  the unique identifier of the security group defined by OSC
     * @param memberList the members within the security group
     *
     * @return the identifier of the security group defined by the security manager
     * @throws Exception upon failure
     */
    String createSecurityGroup(String name, String sgId, SecurityGroupMemberListElement memberList) throws Exception;

    /**
     * Updates security group.
     *
     * @param mgrSecurityGroupId  the identifier of the manager security group
     * @param sgId  the identifier of the security group
     * @param name  the new name for the security group
     * @param memberList  the members within the security group
     * @throws Exception upon failure
     */
    void updateSecurityGroup(String mgrSecurityGroupId, String sgId, String name, SecurityGroupMemberListElement memberList) throws Exception;

    /**
     * Deletes a security group.
     *
     * @param mgrSecurityGroupId  the identifier of the manager security group
     * @throws Exception upon failure
     */
    void deleteSecurityGroup(String mgrSecurityGroupId) throws Exception;

    /**
     * Retrieves all the security groups from the security manager.
     *
     * @return the collection of all the security groups present in the security manager
     * @throws Exception upon failure
     */
    List<? extends ManagerSecurityGroupElement> getSecurityGroupList() throws Exception;

    /**
     * Retrieves the security group given its identifier.
     * @param mgrSecurityGroupId the identifier of the manager security group
     * @return the security group
     * @throws Exception upon failure
     */
    ManagerSecurityGroupElement getSecurityGroupById(String mgrSecurityGroupId) throws Exception;

    @Override
    void close();

}
