package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Virtual System"
 */
public interface VirtualSystemElement {

    /**
     * 
     * @return
     *         Long unique identifier of the virtual system
     */
    public Long getId();

    /**
     * 
     * @return
     *         Unique Virtual System generated name
     */
    public String getName();

    /**
     * @return
     *         String manager identifier created for this virtual system
     */
    public String getMgrId();

    /**
     * @return
     *         Distributed Appliance interface object for this virtual system. {@link DistributedApplianceElement}
     */
    public DistributedApplianceElement getDistributedAppliance();

    /**
     * 
     * @return
     *         Virtualization Connector interface object used by this virtual system
     *         {@link VirtualizationConnectorElement}
     */
    public VirtualizationConnectorElement getVirtualizationConnector();

    /**
     * 
     * @return
     *         Appliance Software Version interface object deployed by this virtual system.
     *         {@link ApplianceSoftwareVersionElement}
     */
    public ApplianceSoftwareVersionElement getApplianceSoftwareVersion();

    /**
     * 
     * @return
     *         Domain interface object which this virtual system was created for. {@link DomainElement}
     */
    public DomainElement getDomain();

    /**
     * 
     * @return
     *         Opaque array of bytes representing keystore generated for this virtual system container.
     */
    public byte[] getKeyStore();

}
