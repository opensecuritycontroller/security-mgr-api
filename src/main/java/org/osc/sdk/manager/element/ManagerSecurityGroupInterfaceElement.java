package org.osc.sdk.manager.element;

/**
 * This documents "Manager Security Group Interface"
 */
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
