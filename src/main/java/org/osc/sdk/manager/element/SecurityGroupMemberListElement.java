package org.osc.sdk.manager.element;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Contains a List of Security group members
 */
@ProviderType
public interface SecurityGroupMemberListElement {

    List<SecurityGroupMemberElement> getMembers();
}
