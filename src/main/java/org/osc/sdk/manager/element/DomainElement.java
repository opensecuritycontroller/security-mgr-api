package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Domain"
 */
@ConsumerType
public interface DomainElement {

    /**
     *
     * @return
     *         String representing Manager Domain identity
     */
    String getMgrId();

}
