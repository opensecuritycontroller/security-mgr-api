package com.intelsecurity.isc.plugin.manager.api;

import java.util.List;

import com.intelsecurity.isc.plugin.manager.element.ManagerPolicyElement;

/**
 * This documents "Manager Policy Apis"
 */
public interface ManagerPolicyApi {

    /**
     * Return the policy element for a give policy unique id.
     *
     * @param id
     *            The policy id.
     * @return The policy element. {@link ManagerPolicyElement}
     * @throws Exception
     */
    ManagerPolicyElement getPolicy(String id, String domainId) throws Exception;

    /**
     * Enumerate and return list of all policies
     *
     * @return List of policies
     * @throws Exception
     */
    List<? extends ManagerPolicyElement> getPolicyList(String domainId) throws Exception;
}
