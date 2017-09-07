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

public interface SecurityGroupInterfaceElement {

<<<<<<< HEAD
    /**
     * @return the identifier of the security group interface
     */
    String getSecurityGroupInterfaceId();

    /**
     * @return the name of the security group interface
     */
    String getName();

    /**
     * Provide manager security group id if the manager is supporting policy
     * mapping and security group.
     *
     * @return the manager security group identifier
     */
    String getManagerSecurityGroupId();

<<<<<<< HEAD
=======
	/**
	 * @return the identifier of the security group interface
	 */
	String getSecurityGroupInterfaceId();

	/**
	 * @return the name of the security group interface
	 */
	String getName();

	/**
	 * Provide manager security group id if the manager is supporting policy
	 * mapping and security group.
	 *
	 * @return the manager security group identifier
	 */
	String getManagerSecurityGroupId();

>>>>>>> fixing more format issues
	/**
	 * Provides the identifier of the policies supported by the manager
	 *
	 * @return the set of policy identifiers
	 */
	Set<String> getManagerPolicyIds();

	/**
<<<<<<< HEAD
=======
    /**
     * Provides the identifier of the policies supported by the manager
     *
     * @return the set of policy identifiers
     */
    Set<String> getManagerPolicyIds();

<<<<<<< HEAD
	/**
	 *
>>>>>>> Addressing code reviews
	 * @return the encapsulation tag supported by the manager
	 */
	String getTag();
=======
    /**
     *
     * @return the encapsulation tag supported by the manager
     */
    String getTag();
>>>>>>> fixing format issues
=======
	 *
	 * @return the encapsulation tag supported by the manager
	 */
	String getTag();
>>>>>>> fixing more format issues

}
