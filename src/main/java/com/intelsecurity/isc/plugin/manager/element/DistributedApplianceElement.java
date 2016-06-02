package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Distributed Appliance"
 */

public interface DistributedApplianceElement {

    /**
     *
     * @return
     *         Appliance Manager Connector interface object used by the Distributed Appliance.
     *         The RESTful BASIC_AUTH password is <b>NOT</b> in the clear on this instance.
     *         {@link ApplianceManagerConnectorElement}
     */
    ApplianceManagerConnectorElement getApplianceManagerConnector();

    /**
     *
     * @return
     *         Appliance interface object used by the Distributed Appliance. {@link ApplianceElement}
     */
    ApplianceElement getAppliance();

    /**
     *
     * @return
     *         String representing the Appliance Software Version used by the Distributed Appliance
     */
    String getApplianceVersion();

    /**
     * Not used.
     *
     * @return
     */
    String getMgrSecretKey();

}
