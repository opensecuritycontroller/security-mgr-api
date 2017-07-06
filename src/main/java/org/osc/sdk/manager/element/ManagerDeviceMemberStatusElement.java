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

import java.util.Date;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface represents the status information of the {@link ManagerDeviceMemberElement}.
 */
@ConsumerType
public interface ManagerDeviceMemberStatusElement {
    /**
     * @return the version of the appliance corresponding to the device member
     */
    String getVersion();

    /**
     * @return the count of the packets received by the security function
     */
    Long getRx();

    /**
     * @return the count of packets sent by the security function
     */
    Long getTxSva();

    /**
     * @return the count of packets dropped by the security function
     */
    Long getDropSva();

    /**
     * @return the current time on the virtualization unit hosting the appliance
     */
    Date getCurrentServerTime();

    /**
     * @return the IP address of the appliance
     */
    String getApplianceIp();

    /**
     * @return the network gateway of the appliance
     */
    String getApplianceGateway();

    /**
     * @return the subnet mask of the appliance
     */
    String getApplianceSubnetMask();

    /**
     * @return the name of the appliance
     */
    String getApplianceName();

    /**
     * @return the IP address of the appliance security manager
     */
    String getManagerIp();

    /**
     * @return the IP address of the security controller associated with this appliance
     */
    String getBrokerIp();

    /**
     * @return whether the appliance has been discovered by the security manager
     */
    Boolean isDiscovered();

    /**
     * @return whether the appliance is fully configured by the security manager and
     * it is ready to perform traffic inspection
     */
    Boolean isInspectionReady();

    /**
     * @return the public IP address of the appliance if available
     */
    String getPublicIp();

    /**
     * @return the {@link DistributedApplianceInstanceElement} related to this device member
     */
    DistributedApplianceInstanceElement getDistributedApplianceInstanceElement();
}
