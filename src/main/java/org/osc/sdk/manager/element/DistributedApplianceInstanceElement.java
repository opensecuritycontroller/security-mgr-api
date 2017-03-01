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
 * This documents "Distributed Appliance Instance"
 */
@ConsumerType
public interface DistributedApplianceInstanceElement {
    /**
     * @return
     * return instance element id
     */
    Long getId();

    /**
     * @return
     * return name of the distributed appliance instance element
     */

    String getName();

    /**
     * @return
     *         Opaque byte array of appliance configuration.
     */
    byte[] getApplianceConfig();

    /**
     * @return
     *         Virtual System of this Distributed Appliance Instance. {@link VirtualSystemElement}
     */
    VirtualSystemElement getVirtualSystem();

}
