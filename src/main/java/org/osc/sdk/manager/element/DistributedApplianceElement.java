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
 * This interface represents the distributed security appliances.
 */
@ConsumerType
public interface DistributedApplianceElement {

    /**
     * @return the manager connector related to this distributed appliance
     */
    ApplianceManagerConnectorElement getApplianceManagerConnector(); // TODO emanoel: It does not look like the plugins or OSC uses this, can we remove?

    /**
     * @return the appliance element related to this distributed appliance
     */
    ApplianceElement getAppliance();

    /**
     * @return the software version of this distributed appliance
     */
    String getApplianceVersion(); // TODO emanoel: instead of this and the appliance element can we just return the ApplianceSoftwareVersionElement?

    /**
     * @return the secret key of the manager related to this distributed appliance
     */
    String getMgrSecretKey(); // TODO emanoel: Is this used? If so does it change with every DA or can it be provided along with the manager conector?
}
