package com.intelsecurity.isc.element;

public interface DistributedApplianceInstanceElement {

    public byte[] getApplianceConfig();

    /**
     * Return owning Virtual System of this Distributed Appliance Instance
     *
     * @return Virtual System interface object
     */
    public VirtualSystemElement getVirtualSystem();

}
