package com.intelsecurity.isc.plugin.manager.element;

import java.util.List;

/**
 * Describes the member within a security group
 */
public interface SecurityGroupMemberElement {

    /**
     * The Security Group member id assigned in the security controller.
     *
     */
    String getId();

    /**
     * The Security Group member name. Can be empty or null.
     *
     */
    String getName();

    /**
     * Gets the Ip address(s) for this member
     */
    List<String> getIpAddresses();

    /**
     * Gets the Mac address(s) for this member
     */
    List<String> getMacAddresses();
}
