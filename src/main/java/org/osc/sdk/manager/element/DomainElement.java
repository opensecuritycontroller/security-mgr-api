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

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface represents security manager domains.
 * <p>
 * Some security managers define scopes for the managed entities such as devices or policies.
 * This interface is used to represent those scopes.
 */
@ConsumerType
public interface DomainElement {

    /**
     * @return the identifier of the domain defined by the security manager
     */
    String getMgrId(); // TODO emanoel: looks like this is used on the virtualsystemelement, can we remove this interface and
    // simply return the domain id from in the virtualsystem? seems like the intention here was to map the OSC db relationshipts
    // but these interfaces can be simler than our db schema.
}
