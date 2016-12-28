package org.osc.sdk.manager.element;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Describes the member within a security group
 */
@ProviderType
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
