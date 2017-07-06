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
import org.osc.sdk.manager.element.DistributedApplianceInstanceElement;
import org.osc.sdk.manager.element.ManagerDeviceMemberStatusElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface documents the operations used by OSC to retrieve the status of the device members
 * as well as and trigger events on their respective appliance instances.
 * <p>
 * These APIs are required only if the manager is configured to provide device status,
 * see {@link Constants#PROVIDE_DEVICE_STATUS}.
 */
@ConsumerType
public interface ManagerDeviceMemberApi {

    /**
     * Provides the status information for all the given appliance instances.
     *
     * @param list  the collection of appliance instances
     * @return the status of each provided appliance instance
     */
    List<ManagerDeviceMemberStatusElement> getFullStatus(List<DistributedApplianceInstanceElement> list);

    /**
     * TBD
     */
    void reAuthenticateAppliance();  // TODO emanoel: are these needed?

    /**
     * TBD
     */
    void syncAgent();
}