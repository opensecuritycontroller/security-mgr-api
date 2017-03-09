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
 * This interface represents the virtual systems defined in OSC.
 * <p>
 * A virtual system consists of the relationship between a domain defined by the
 * security manager, a virtualization platform known to OSC and the security function.
 */
@ConsumerType
public interface VirtualSystemElement {

    /**
     * @return the identifier of the virtual system defined by OSC
     */
    Long getId();

    /**
     * @return the unique name of the virtual system defined by OSC
     */
    String getName();

    /**
     * @return the identifier of the security manager defined in OSC that provided the domain {@link #getDomain()}
     */
    String getMgrId();

    /**
     * @return the distributed appliance associated with this virtual system
     */
    DistributedApplianceElement getDistributedAppliance();

    /**
     *
     * @return the virtualization connector defined in OSC associated with this virtual system
     */
    VirtualizationConnectorElement getVirtualizationConnector();

    /**
     *
     * @return the software version of the appliance associated with this virtual system
     */
    ApplianceSoftwareVersionElement getApplianceSoftwareVersion();

    /**
     * @return the domain defined in the security manager related to this virtual system
     */
    DomainElement getDomain();

    /**
     * @return the opaque array of bytes representing keystore generated for this virtual system
     */
    byte[] getKeyStore();
}
