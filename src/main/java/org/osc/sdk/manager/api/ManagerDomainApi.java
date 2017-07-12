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
import org.osc.sdk.manager.element.ManagerDomainElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface documents the operations used by OSC to retrieve domain
 * information from the security managers.
 * <p>
 * This API is required only for managers that support policy mapping, see {@link Constants#SYNC_POLICY_MAPPING}
 */
@ConsumerType
public interface ManagerDomainApi {

    /**
     * Return the domain element for a given domain unique identifier defined by the security manager.
     *
     * @param id  the identifier of the domain
     * @return the targeted domain
     * @throws Exception upon failure
     */
    ManagerDomainElement getDomain(String id) throws Exception;

    /**
     * Return all the domains defined in the security manager.
     *
     * @return the collection of all domains defined in the security manager
     * @throws Exception upon failure
     */
    List<? extends ManagerDomainElement> listDomains() throws Exception;
}
