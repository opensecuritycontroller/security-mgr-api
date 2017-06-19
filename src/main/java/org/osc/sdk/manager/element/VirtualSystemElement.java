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
 * This documents "Virtual System"
 */
@ConsumerType
public interface VirtualSystemElement {

    /**
     *
     * @return
     *         Long unique identifier of the virtual system
     */
    Long getId();

    /**
     *
     * @return
     *         Unique Virtual System generated name
     */
    String getName();

    /**
     * @return
     *         String manager identifier created for this virtual system
     */
    String getMgrId();

    /**
     * @return
     *         Distributed Appliance interface object for this virtual system. {@link DistributedApplianceElement}
     */
    DistributedApplianceElement getDistributedAppliance();

    /**
     *
     * @return
     *         Virtualization Connector interface object used by this virtual system
     *         {@link VirtualizationConnectorElement}
     */
    VirtualizationConnectorElement getVirtualizationConnector();

    /**
     *
     * @return
     *         Appliance Software Version interface object deployed by this virtual system.
     *         {@link ApplianceSoftwareVersionElement}
     */
    ApplianceSoftwareVersionElement getApplianceSoftwareVersion();

    /**
     *
     * @return
     *         Domain interface object which this virtual system was created for. {@link DomainElement}
     */
    DomainElement getDomain();

    /**
     *
     * @return
     *         Opaque array of bytes representing keystore generated for this virtual system container.
     */
    byte[] getKeyStore();

}
