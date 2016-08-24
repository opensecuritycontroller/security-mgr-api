package com.intelsecurity.isc.plugin.manager.element;

import java.util.List;

/**
 * Contains a List of Security group members
 */
public interface SecurityGroupMemberListElement {

    List<SecurityGroupMemberElement> getMembers();
}
