package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Security Group"
 */
public interface ManagerSecurityGroupElement {
    /**
     * @return
     *         Security Group Id in Manager Connector
     */
    public String getSGId();

    /**
     * @return
     *         Security Group Name in Manager
     */
    public String getName();
}
