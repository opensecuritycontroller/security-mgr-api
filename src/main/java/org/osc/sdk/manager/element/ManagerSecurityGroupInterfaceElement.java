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

import java.util.Set;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface represents the mapping between the policies {@link ManagerPolicyElement}
 * and VLAN tags defined in OSC.
 */
@ConsumerType
public interface ManagerSecurityGroupInterfaceElement {
	/**
	 * @return the identifier of the security group interface defined by OSC
	 */
	String getSecurityGroupInterfaceId();

	/**
	 * @return the name of the security group interface defined by OSC
	 */
	String getName();
<<<<<<< HEAD

<<<<<<< HEAD
	/**
	 * Provides the identifier of the security group defined by security managers that support policy mapping and
	 * security groups
	 *
	 * @return the identifier of the security group defined by the manager
	 */
	String getManagerSecurityGroupId();

	/**
	 * Provides the identifier of the policies supported by the manager
	 *
	 * @return the set of policy identifiers
	 */
	Set<String> getManagerPolicyIds();

	/**
	 * @return the encapsulation tag supported by the manager
	 */
	String getTag();
=======
    /**
     * Provides the identifier of the security group defined by security managers that support policy mapping and
     * security groups
     *
     * @return the identifier of the security group defined by the manager
     */
    String getManagerSecurityGroupId();
=======

	/**
	 * Provides the identifier of the security group defined by security managers that support policy mapping and
	 * security groups
	 *
	 * @return the identifier of the security group defined by the manager
	 */
	String getManagerSecurityGroupId();
>>>>>>> fixing more format issues

	/**
	 * Providers the identifier of the policies supported by the manager
	 *
	 * @return the set of policy identifiers
	 */
	Set<String> getManagerPolicyIds();

<<<<<<< HEAD
    /**
     * @return the encapsulation tag supported by the manager
     */
    String getTag();
>>>>>>> Addressing code reviews
=======
	/**
	 * @return the encapsulation tag supported by the manager
	 */
	String getTag();
>>>>>>> fixing more format issues
}
