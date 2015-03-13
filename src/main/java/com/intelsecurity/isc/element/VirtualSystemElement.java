package com.intelsecurity.isc.element;

public interface VirtualSystemElement {

    /**
     * Return Virtual System id
     *
     * @return Long unique identifier of the virtual system
     */
    public Long getId();

    /**
     * Return Virtual System generated name
     *
     * @return Unique string name of the virtual system
     */
    public String getName();

    /**
     * Return manager identifier created for this virtual system
     *
     * @return String identifier created by manager
     */
    public String getMgrId();

    /**
     * Return the owning distributed appliance for this virtual system
     *
     * @return Distributed Appliance inteface object
     */
    public DistributedApplianceElement getDistributedAppliance();

    /**
     * Return Virtualization Connector used by this virtual system
     *
     * @return Virtualization Connector interface object
     */
    public VirtualizationConnectorElement getVirtualizationConnector();

    /**
     * Get the appliance software version deployed by this virtual system
     *
     * @return Appliance Software Version interface object
     */
    public ApplianceSoftwareVersionElement getApplianceSoftwareVersion();

    /**
     * Return domain to which this virtual system was created in
     *
     * @return Domain interface object
     */
    public DomainElement getDomain();

    /**
     * Return the public/private keystore generated for this virtual system container.
     *
     * @return Opaque array of bytes representing keystore.
     */
    public byte[] getKeyStore();

}
