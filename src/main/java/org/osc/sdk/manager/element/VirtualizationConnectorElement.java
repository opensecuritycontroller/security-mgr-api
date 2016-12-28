package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Virtualization Connector"
 */
@ConsumerType
public interface VirtualizationConnectorElement {

    /**
     *
     * @return
     *         Virtualization Connector name
     */
    String getName();

}
