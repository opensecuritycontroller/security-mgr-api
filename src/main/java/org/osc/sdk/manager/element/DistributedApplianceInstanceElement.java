package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;
/**
 * This documents "Distributed Appliance Instance"
 */
@ConsumerType
public interface DistributedApplianceInstanceElement {
    /**
     * @return
     * return instance element id
     */
    public Long getId();

    /**
     * @return
     * return name of the distributed appliance instance element
     */

    public String getName();

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
