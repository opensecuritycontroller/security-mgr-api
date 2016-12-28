package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Appliance Definition"
 */
@ConsumerType
public interface ApplianceElement {

    /**
     *
     * @return
     *         Appliance Model
     */
    String getModel();

}
