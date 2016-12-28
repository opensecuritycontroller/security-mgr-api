package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Appliance Software Version"
 */
@ConsumerType
public interface ApplianceSoftwareVersionElement {

    /**
     * @return
     *         Appliance Software Version String
     */
    String getApplianceSoftwareVersion();

    /**
     * @return
     *         Model of this appliance
     */
    String getApplianceModel();
}
