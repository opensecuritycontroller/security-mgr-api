package com.intelsecurity.isc.plugin.manager.api;

import java.util.List;

import com.intelsecurity.isc.plugin.manager.element.ManagerDomainElement;

/**
 * This documents "Manager Domain Apis"
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
    public abstract ManagerDomainElement getDomain(String id) throws Exception;

    /**
     * Enumerate and return list of all domains
     * 
     * @return List of domains. List<{@link ManagerDomainElement}>
     * @throws Exception
     */
    public abstract List<? extends ManagerDomainElement> listDomains() throws Exception;
}
