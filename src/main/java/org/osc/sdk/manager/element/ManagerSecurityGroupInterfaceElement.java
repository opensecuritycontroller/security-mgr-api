package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Security Group Interface"
 */
@ConsumerType
public interface ManagerSecurityGroupInterfaceElement {
    /**
     * @return
     *         Security Group Interface Id in Manager Connector
     */
    String getSecurityGroupInterfaceId();

    /**
     * @return
     *         Security Group Interface Name
     */
    String getName();

    /**
     * @return
     *         Policy ID
     */
    String getPolicyId();

    /**
     * @return
     *         Policy Tag
     */
    String getTag();
}
