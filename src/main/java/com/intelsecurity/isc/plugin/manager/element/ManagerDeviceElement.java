package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Manager Device". This represents Device Container
 */
public interface ManagerDeviceElement {
    /**
     * @return
     *         Unique ID of this device in String format
     */
    public String getId();

    /**
     * @return
     *         Device Name
     */
    public String getName();
}
