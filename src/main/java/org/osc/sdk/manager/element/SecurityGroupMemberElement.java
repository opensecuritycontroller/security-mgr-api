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
package org.osc.sdk.manager.element;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Describes the member within a security group
 */
@ProviderType
public interface SecurityGroupMemberElement {

    /**
     * The Security Group member id assigned in the security controller.
     *
     */
    String getId();

    /**
     * The Security Group member name. Can be empty or null.
     *
     */
    String getName();

    /**
     * Gets the Ip address(s) for this member
     */
    List<String> getIpAddresses();

    /**
     * Gets the Mac address(s) for this member
     */
    List<String> getMacAddresses();
}
