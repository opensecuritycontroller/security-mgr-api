package org.osc.sdk.manager.api;

import java.util.List;

import org.osc.sdk.manager.element.ManagerDomainElement;

/**
 * This documents "Manager Domain Apis". This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#isPolicyMappingSupported()} returns true.
 */

public interface ManagerDomainApi {

    /**
     * Return the domain element for a give domain unique id.
     *
     * @param id
     *            The domain id (String).
     * @return The domain element. {@link ManagerDomainElement}
     * @throws Exception
     */
    ManagerDomainElement getDomain(String id) throws Exception;

    /**
     * Enumerate and return list of all domains
     *
     * @return List of domains. List<{@link ManagerDomainElement}>
     * @throws Exception
     */
    List<? extends ManagerDomainElement> listDomains() throws Exception;
}
