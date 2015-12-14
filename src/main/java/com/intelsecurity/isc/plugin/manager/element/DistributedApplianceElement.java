package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Distributed Appliance"
 */

public interface DistributedApplianceElement {

    /**
     * 
     * @return
     *         Appliance Manager Connector interface object used by the Distributed Appliance
     *         {@link ApplianceManagerConnectorElement}
     */
    public ApplianceManagerConnectorElement getApplianceManagerConnector();

    /**
     * 
     * @return
     *         Appliance interface object used by the Distributed Appliance. {@link ApplianceElement}
     */
    public ApplianceElement getAppliance();

    /**
     * 
     * @return
     *         String representing the Appliance Software Version used by the Distributed Appliance
     */
    public String getApplianceVersion();

    /**
     * Not used.
     * 
     * @return
     */
    public String getMgrSecretKey();

}
