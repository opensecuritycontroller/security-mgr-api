package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Policy"
 */
@ConsumerType
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
