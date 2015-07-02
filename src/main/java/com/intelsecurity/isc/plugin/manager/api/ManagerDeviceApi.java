package com.intelsecurity.isc.plugin.manager.api;

import java.util.List;

import com.intelsecurity.isc.plugin.manager.element.DistributedApplianceInstanceElement;
import com.intelsecurity.isc.plugin.manager.element.ManagerDeviceElement;
import com.intelsecurity.isc.plugin.manager.element.ManagerDeviceMemberElement;
import com.intelsecurity.isc.plugin.manager.element.ManagerSecurityGroupElement;
import com.intelsecurity.isc.plugin.manager.element.ManagerSecurityGroupInterfaceElement;

public interface ManagerDeviceApi {

    /**
     * Find device given device id
     *
     * @param id
     *            The device unique id
     * @return The device element found. Null if not found.
     * @throws Exception
     */
    public abstract ManagerDeviceElement getDeviceById(String id) throws Exception;

    /**
     * Find device by name
     *
     * @param name
     *            of the device to locate
     * @return The device element unique id. Null if not found.
     * @throws Exception
     */
    public abstract String findDeviceByName(String name) throws Exception;

    /**
     * Enumerate all device elements
     *
     * @return List of device elements
     * @throws Exception
     */
    public abstract List<? extends ManagerDeviceElement> getDeviceList() throws Exception;

    /**
     * Create Device Container for current VS
     *
     * @return The id of the device container which was created.
     * @throws Exception
     */
    public abstract String createVSSDevice() throws Exception;

    /**
     * Update Device Container for current VS
     *
     * @param device
     * @throws Exception
     */
    public void updateVSSDevice(ManagerDeviceElement device) throws Exception;

    /**
     * Delete device container. The id is taken from VS
     *
     * @throws Exception
     */
    public abstract void deleteVSSDevice() throws Exception;

    /**
     * Create a member device in context of current VS device container
     *
     * @param name
     *            A unique name for member device
     * @param ipAddress
     *            IPv4 publicly accessible address
     * @param contactIpAddress
     *            In case of NAT, IPv4 privately accessible
     * @return the unique identifier of the member device
     * @throws Exception
     */
    public abstract String createDeviceMember(String name, String vserverIpAddress, String contactIpAddress,
            String ipAddress, String gateway, String prefixLength) throws Exception;

    /**
     * Delete member device given member device id from current VS device container
     *
     * @param id
     *            The member device id to delete
     * @throws Exception
     */
    public abstract void deleteDeviceMember(String id) throws Exception;

    /**
     * Find member device using id from current VS device container
     *
     * @param id
     *            The member device id to locate
     * @return The member device element
     * @throws Exception
     */
    public abstract ManagerDeviceMemberElement getDeviceMemberById(String id) throws Exception;

    /**
     * Locate member device by name within the members of current VS device container
     *
     * @param name
     *            The member device name to locate
     * @return The member device id. Null if not found.
     * @throws Exception
     */
    public abstract String findDeviceMemberByName(String name) throws Exception;

    /**
     * Return the list of all member device elements for current VS device container
     *
     * @return The list of device member elements
     * @throws Exception
     */
    public abstract List<? extends ManagerDeviceMemberElement> getDeviceMemberList() throws Exception;

    /**
     * Create security group interface within context of VS device container
     *
     * @param securityGroup
     * @return
     * @throws Exception
     */
    public abstract String createSecurityGroupInterface(String name, String policyId, String tag) throws Exception;

    /**
     * Update security group attributes (name, policy assignment) given its id
     *
     * @param id
     *            The security group id to update
     * @param securityGroup
     *            The updated attributes
     * @throws Exception
     */
    public abstract void updateSecurityGroupInterface(String id, String name, String policyId, String tag)
            throws Exception;

    /**
     * Delete security group interface within context of VS device container
     *
     * @param id
     *            The id of the security group interface to delete
     * @throws Exception
     */
    public abstract void deleteSecurityGroupInterface(String id) throws Exception;

    /**
     * Find security group by id within the context of VS device container and and return security group element
     *
     * @param id
     *            The security group id to locate
     * @return The security group element found. Null if not found.
     * @throws Exception
     */
    public abstract ManagerSecurityGroupInterfaceElement getSecurityGroupInterfaceById(String id) throws Exception;

    /**
     * Locate Security group by name with in the context of VS device container and return unique id if found.
     *
     * @param name
     *            The security group name to locate.
     * @return The security group id.
     * @throws Exception
     */
    public abstract String findSecurityGroupInterfaceByName(String name) throws Exception;

    /**
     * Get list of all security group interfaces within the context of the VS device container.
     *
     * @return The security group element list.
     * @throws Exception
     */
    public abstract List<? extends ManagerSecurityGroupInterfaceElement> getSecurityGroupInterfaceList()
            throws Exception;

    /**
     * If manager requires session creation before API calls, close() should be implementing session release.
     */
    public abstract void close();

    /**
     * Check if a appliance upgrade from version represented by srcSwVersion van be upgraded to another version
     * represented by destSwVersion.
     *
     * @param modelType
     *            The appliance model for which version upgrade is being checked.
     * @param srcSwVersion
     *            The software version to upgrade from.
     * @param destSwVersion
     *            The software version to upgrade to.
     * @return true if upgrade is supported.
     * @throws Exception
     */
    public abstract boolean isUpgradeSupported(String modelType, String srcSwVersion, String destSwVersion)
            throws Exception;

    /**
     * Get individual member device configuration from Manager to be persisted in ISC. Returned blob will be downloaded
     * to appliance during registration and passed on to manager authentication script.
     *
     * @param mgrDeviceId
     *            The member device id for which configuration is to be retrieved.
     * @return Opaque byte array representing member device configuration
     * @throws Exception
     */
    public abstract byte[] getDeviceMemberConfig(String mgrDeviceId) throws Exception;

    /**
     * Return Member Device Configuration stored in ISC to be downloaded to device member
     *
     * @param Distributed
     *            Appliance Instance interface object from which stored configuration will be retrieved.
     * @return Opaque byte array representing member device configuration
     */
    public abstract byte[] getDeviceMemberConfig1(DistributedApplianceInstanceElement dai);

    /**
     * Return Member Device Configuration stored in ISC to be downloaded to device member
     *
     * @param Distributed
     *            Appliance Instance interface object from which stored configuration will be retrieved.
     * @return Opaque byte array representing member device configuration
     */
    public abstract byte[] getDeviceMemberConfig2(DistributedApplianceInstanceElement dai);

    public abstract boolean isSecurityGroupSyncSupport();

    /**
     * Create an security group
     *
     * @param name
     *            Name of the security group
     * @return The Manager Id for the newly created Security Group object
     */
    public abstract String createSecurityGroup(String name) throws Exception;

    /**
     * Update an Security Group object
     *
     * @param mgrId
     *            The Security Group object id
     * @param name
     *            The updated name of the Security Group object
     */
    public abstract void updateSecurityGroup(String mgrId, String name) throws Exception;

    /**
     * Delete an Security Group object
     *
     * @param mgrId
     *            The Security Group object id
     * @throws Exception
     */
    public abstract void deleteSecurityGroup(String mgrId) throws Exception;

    /**
     * List all security groups
     *
     * @return List of security groups
     */
    public abstract List<? extends ManagerSecurityGroupElement> getSecurityGroupList() throws Exception;

}
