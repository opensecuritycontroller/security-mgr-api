package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Domain"
 */
@ConsumerType
public interface ManagerDomainElement {
    String getId();

    String getName();
}
