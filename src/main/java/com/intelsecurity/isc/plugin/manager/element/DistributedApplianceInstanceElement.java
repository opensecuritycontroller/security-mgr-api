package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Distributed Appliance Instance"
 */

public interface DistributedApplianceInstanceElement {

    /**
     * @return
     *         Opaque byte array of appliance configuration.
     */
    byte[] getApplianceConfig();

    /**
     * @return
     *         Virtual System of this Distributed Appliance Instance. {@link VirtualSystemElement}
     */
    VirtualSystemElement getVirtualSystem();

}
