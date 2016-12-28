package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Security Group"
 */
@ConsumerType
public interface ManagerSecurityGroupElement {
    /**
     * @return
     *         Security Group Id in Manager Connector
     */
    String getSGId();

    /**
     * @return
     *         Security Group Name in Manager
     */
    String getName();
}
