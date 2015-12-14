package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Security Group Interface"
 */
public interface ManagerSecurityGroupInterfaceElement {
    /**
     * @return
     *         Security Group Interface Id in Manager Connector
     */
    public String getSecurityGroupInterfaceId();

    /**
     * @return
     *         Security Group Interface Name
     */
    public String getName();

    /**
     * @return
     *         Policy ID
     */
    public String getPolicyId();

    /**
     * @return
     *         Policy Tag
     */
    public String getTag();
}
