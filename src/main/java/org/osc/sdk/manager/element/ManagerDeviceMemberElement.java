package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Device Member". This represents Deployed Instances
 */
@ConsumerType
public interface ManagerDeviceMemberElement {
    /**
     * @return
     *         String formatted Identifier of device member
     */
    String getId();

    /**
     * @return
     *         Device member name
     */
    String getName();
}
