package com.intelsecurity.isc.element;

public interface DistributedApplianceElement {

    /**
     * Returns the Appliance Manager Connector used by the Distributed Appliance
     *
     * @return Appliance Manager Connector interface object
     */
    public ApplianceManagerConnectorElement getApplianceManagerConnector();

    /**
     * Returns the Appliance Definition used by the Distributed Appliance
     *
     * @return Appliance Definition interface object
     */
    public ApplianceElement getAppliance();

    /**
     * Returns the Appliance Software Version used by the Distributed Appliance
     *
     * @return String representing the Appliance Software Version
     */
    public String getApplianceVersion();

    /**
     * Not used.
     *
     * @return
     */
    public String getMgrSecretKey();

}
