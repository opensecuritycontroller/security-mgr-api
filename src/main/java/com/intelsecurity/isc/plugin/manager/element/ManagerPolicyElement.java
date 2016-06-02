package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Policy"
 */
public interface ManagerPolicyElement {
    /**
     * @return
     *         Unique Identifier representing Policy in Manager as a String
     */
    String getId();

    /**
     * @return
     *         Policy Name
     */
    String getName();
}
