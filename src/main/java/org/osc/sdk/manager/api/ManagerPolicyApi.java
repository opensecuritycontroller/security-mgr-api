package org.osc.sdk.manager.api;

import java.util.List;

import org.osc.sdk.manager.element.ManagerPolicyElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Policy Apis"
 */
@ConsumerType
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
