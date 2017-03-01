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

import org.osc.sdk.manager.element.ManagerPolicyElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Policy Apis"
 */
@ConsumerType
public interface ManagerPolicyApi {

    /**
     * Return the policy element for a give policy unique id.
     *
     * @param id
     *            The policy id.
     * @return The policy element. {@link ManagerPolicyElement}
     * @throws Exception
     */
    ManagerPolicyElement getPolicy(String id, String domainId) throws Exception;

    /**
     * Enumerate and return list of all policies
     *
     * @return List of policies
     * @throws Exception
     */
    List<? extends ManagerPolicyElement> getPolicyList(String domainId) throws Exception;
}
