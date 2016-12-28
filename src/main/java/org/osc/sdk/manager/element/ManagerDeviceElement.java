package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Device". This represents Device Container
 */
@ConsumerType
public interface ManagerDeviceElement {
    /**
     * @return
     *         Unique ID of this device in String format
     */
    String getId();

    /**
     * @return
     *         Device Name
     */
    String getName();
}
