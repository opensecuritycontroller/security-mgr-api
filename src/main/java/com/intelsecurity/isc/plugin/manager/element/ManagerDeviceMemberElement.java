package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Device Member". This represents Deployed Instances
 */
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
