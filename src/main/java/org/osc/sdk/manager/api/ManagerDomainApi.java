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

import org.osc.sdk.manager.element.ManagerDomainElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Domain Apis". This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#isPolicyMappingSupported()} returns true.
 */
@ConsumerType
public interface ManagerDomainApi {

    /**
     * Return the domain element for a give domain unique id.
     *
     * @param id
     *            The domain id (String).
     * @return The domain element. {@link ManagerDomainElement}
     * @throws Exception
     */
    ManagerDomainElement getDomain(String id) throws Exception;

    /**
     * Enumerate and return list of all domains
     *
     * @return List of domains. List<{@link ManagerDomainElement}>
     * @throws Exception
     */
    List<? extends ManagerDomainElement> listDomains() throws Exception;
}
