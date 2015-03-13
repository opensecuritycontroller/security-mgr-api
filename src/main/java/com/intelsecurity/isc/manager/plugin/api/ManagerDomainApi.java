package com.intelsecurity.isc.manager.plugin.api;

import java.util.List;

import com.intelsecurity.isc.manager.plugin.element.ManagerDomainElement;

public interface ManagerDomainApi {

    /**
     * Return the domain element for a give domain unique id.
     * 
     * @param id
     *            The domain id.
     * @return The domain element
     * @throws Exception
     */
    public abstract ManagerDomainElement getDomain(String id) throws Exception;

    /**
     * Enumerate and return list of all domains
     * 
     * @return List of domains
     * @throws Exception
     */
    public abstract List<? extends ManagerDomainElement> getDomainList() throws Exception;
}
