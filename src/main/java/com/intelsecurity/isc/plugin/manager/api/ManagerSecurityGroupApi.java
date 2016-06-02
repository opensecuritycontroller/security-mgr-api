package com.intelsecurity.isc.plugin.manager.api;

import java.util.List;

import com.intelsecurity.isc.plugin.manager.element.ManagerSecurityGroupElement;

/**
 * This documents "Manager Security Group Apis". This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#isSecurityGroupSyncSupport()} returns true.
 */
public interface ManagerSecurityGroupApi extends AutoCloseable {

    /**
     * Create an security group
     *
     * @param name
     *            Name of the security group
     * @param iscId
     *            Unique Identifier (String) representing ISC which is responsible for this Security Group
     *
     * @return
     *         The Manager Id for the newly created Security Group object
     */
    String createSecurityGroup(String name, String iscId) throws Exception;

    /**
     * Update an Security Group object
     *
     * @param sgId
     *            The Security Group object id
     * @param name
     *            The updated name of the Security Group object
     */
    void updateSecurityGroup(String sgId, String name) throws Exception;

    /**
     * Delete an Security Group object
     *
     * @param sgId
     *            The Security Group object id
     * @throws Exception
     */
    void deleteSecurityGroup(String sgId) throws Exception;

    /**
     * List all security groups
     *
     * @return
     *         List of security groups. List<{@link ManagerSecurityGroupElement}>
     */
    List<? extends ManagerSecurityGroupElement> getSecurityGroupList() throws Exception;

    /**
     * @param sgId
     *            The Security Group object id
     * @return
     *         Security Group Object {@link ManagerSecurityGroupElement}
     * @throws Exception
     */
    ManagerSecurityGroupElement getSecurityGroupById(String sgId) throws Exception;

    @Override
    void close();

}
