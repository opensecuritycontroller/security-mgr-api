package org.osc.sdk.manager.element;

/**
 * This documents "Virtual System"
 */
public interface VirtualSystemElement {

    /**
     *
     * @return
     *         Long unique identifier of the virtual system
     */
    Long getId();

    /**
     *
     * @return
     *         Unique Virtual System generated name
     */
    String getName();

    /**
     * @return
     *         String manager identifier created for this virtual system
     */
    String getMgrId();

    /**
     * @return
     *         Distributed Appliance interface object for this virtual system. {@link DistributedApplianceElement}
     */
    DistributedApplianceElement getDistributedAppliance();

    /**
     *
     * @return
     *         Virtualization Connector interface object used by this virtual system
     *         {@link VirtualizationConnectorElement}
     */
    VirtualizationConnectorElement getVirtualizationConnector();

    /**
     *
     * @return
     *         Appliance Software Version interface object deployed by this virtual system.
     *         {@link ApplianceSoftwareVersionElement}
     */
    ApplianceSoftwareVersionElement getApplianceSoftwareVersion();

    /**
     *
     * @return
     *         Domain interface object which this virtual system was created for. {@link DomainElement}
     */
    DomainElement getDomain();

    /**
     *
     * @return
     *         Opaque array of bytes representing keystore generated for this virtual system container.
     */
    byte[] getKeyStore();

}
