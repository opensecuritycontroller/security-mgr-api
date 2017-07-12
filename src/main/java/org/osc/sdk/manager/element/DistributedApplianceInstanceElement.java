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
 * This interface represents distributed appliance instances.
 * <p>
 * This element is provided by OSC when retrieving manager device members information.
 * One distributed appliance instance maps to one device member.
 */
@ConsumerType
public interface DistributedApplianceInstanceElement {
    /**
     * @return the OSC identifier of this distributed appliance instance
     */
    Long getId();

    /**
     * @return  the name of this distributed appliance instance
     */
    String getName();

    /**
     * @return the configuration of this distributed appliance instance
     */
    byte[] getApplianceConfig(); // TODO emanoel: This does not seem to be used by anybody, remove?


    /**
     * @return the virtual system related to this distributed appliance instance
     */
    VirtualSystemElement getVirtualSystem(); // TODO emanoel: used by getDeviceMemberConfiguration which is not used by anybody, remove?
}
