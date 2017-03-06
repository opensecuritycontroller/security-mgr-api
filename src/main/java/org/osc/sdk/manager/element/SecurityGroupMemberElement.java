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
 * This interface represents the protected workloads specified within
 * security groups {@link ManagerSecurityGroupElement}.
 */
@ProviderType
public interface SecurityGroupMemberElement {
    /**
     * @return the identifier of the security group member defined by OSC
     */
    String getId();

    /**
     * @return the name of the security group member defined in OSC
     */
    String getName();


    /**
     * @return the IP addresses of the security group member
     */
    List<String> getIpAddresses();

    /**
     * @return the MAC addresses of the security group member
     */
    List<String> getMacAddresses();
}
