package org.osc.sdk.manager.element;

import java.util.Date;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Agent"
 */
@ConsumerType
public interface ManagerDeviceMemberStatusElement {
    String getVersion();
    Long getRx();     // Received packets to security function appliance
    Long getTxSva();   // Packet sent out as instructed by security function appliance
    Long getDropSva(); // Dropped as instructed by security function appliance
    Date getCurrentServerTime();
    String getApplianceIp();
    String getApplianceGateway();
    String getApplianceSubnetMask();
    String getApplianceName();
    String getManagerIp();
    String getBrokerIp();

    Boolean isDiscovered();
    Boolean isInspectionReady();
    String getPublicIp();
    DistributedApplianceInstanceElement getDistributedApplianceInstanceElement();
}
