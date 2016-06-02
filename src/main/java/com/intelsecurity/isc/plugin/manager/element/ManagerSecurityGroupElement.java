package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Security Group"
 */
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
