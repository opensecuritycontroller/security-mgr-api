package org.osc.sdk.manager.api;

import java.util.List;

import org.osc.sdk.manager.element.ApplianceBootstrapInformationElement;
import org.osc.sdk.manager.element.BootStrapInfoProviderElement;
import org.osc.sdk.manager.element.DistributedApplianceInstanceElement;
import org.osc.sdk.manager.element.ManagerDeviceElement;
import org.osc.sdk.manager.element.ManagerDeviceMemberElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Device Management Apis"
 */
@ConsumerType
public interface ManagerDeviceApi extends AutoCloseable {

    /**
     * Returns True if Device Group(VSS) is supported.
     * @return
     */
    boolean isDeviceGroupSupported();

    /**
     * Find device given device id
     *
     * @param id
     *            The device unique id
     * @return
     *         The device element found. Null if not found. {@link ManagerDeviceElement}
     * @throws Exception
     */
    ManagerDeviceElement getDeviceById(String id) throws Exception;

    /**
     * Find device by name
     *
     * @param name
     *            of the device to locate
     * @return
     *         The device element unique id (String) or null if not found.
     * @throws Exception
     */
    String findDeviceByName(String name) throws Exception;

    /**
     * Enumerate all device elements
     *
     * @return
     *         List of device elements List<{@link ManagerDeviceElement}>
     * @throws Exception
     */
    List<? extends ManagerDeviceElement> listDevices() throws Exception;

    /**
     * Create Device Container for current Virtual System
     *
     * @return
     *         The id (String) of the device container which was created.
     * @throws Exception
     */
    String createVSSDevice() throws Exception;

    /**
     * Update Device Container for current VS
     *
     * @param device
     *            {@link ManagerDeviceElement}
     * @throws Exception
     */
    void updateVSSDevice(ManagerDeviceElement device) throws Exception;

    /**
     * Delete device container. The id is taken from VS
     *
     * @throws Exception
     */
    void deleteVSSDevice() throws Exception;

    /**
     * Create a member device in context of current VS device container
     *
     * @param name
     *            A unique name for member device
     * @param vserverIpAddress
     *            Virtualization Server IP address
     * @param contactIpAddress
     *            In case of NAT, IPv4 privately accessible
     * @param ipAddress
     *            Public IP Address
     * @param gateway
     *            Gateway IP address
     * @param prefixLength
     *            Prefix Length for given Subnet
     * @return
     *         the unique identifier (String) of the member device
     * @throws Exception
     */
    String createDeviceMember(String name, String vserverIpAddress, String contactIpAddress,
            String ipAddress, String gateway, String prefixLength) throws Exception;

    /**
     * @param deviceElement
     *            {@link ManagerDeviceMemberElement}
     * @param name
     *            Device Name. A unique and immutable identifier generated by ISC.
     * @param deviceHostName
     *            Hypervisor host name or IP Address hosting this device
     * @param ipAddress
     *            Immutable and unique Device IPv4 Address
     * @param mgmtIPAddress
     *            Device Management IP Address
     * @param gateway
     *            Gateway IP Address
     * @param prefixLength
     *            Prefix Length
     * @return
     *         updated device member id (String) or the same device member id if nothing to update.
     *
     * @throws Exception
     */
    String updateDeviceMember(ManagerDeviceMemberElement deviceElement, String name,
            String deviceHostName, String ipAddress, String mgmtIPAddress, String gateway, String prefixLength)
            throws Exception;

    /**
     * Delete member device given member device id from current VS device container
     *
     * @param id
     *            The member device id to delete
     * @throws Exception
     */
    void deleteDeviceMember(String id) throws Exception;

    /**
     * Find member device using id from current VS device container
     *
     * @param id
     *            The member device id to locate
     * @return The member device element
     * @throws Exception
     */
    ManagerDeviceMemberElement getDeviceMemberById(String id) throws Exception;

    /**
     * Locate member device by name within the members of current VS device container
     *
     * @param name
     *            The member device name to locate
     * @return
     *         The member device id. Null if not found. {@link ManagerDeviceMemberElement}
     * @throws Exception
     */
    ManagerDeviceMemberElement findDeviceMemberByName(String name) throws Exception;

    /**
     * Return the list of all member device elements for current VS device container
     *
     * @return
     *         The list of device member elements. List<{@link ManagerDeviceMemberElement}>
     * @throws Exception
     */
    List<? extends ManagerDeviceMemberElement> listDeviceMembers() throws Exception;

    /**
     * Check if a appliance upgrade from version represented by srcSwVersion van be upgraded to another version
     * represented by destSwVersion.
     *
     * @param modelType
     *            The appliance model for which version upgrade is being checked.
     * @param prevSwVersion
     *            The software version to upgrade from.
     * @param newSwVersion
     *            The software version to upgrade to.
     * @return
     *         true if upgrade is supported.
     * @throws Exception
     */
    boolean isUpgradeSupported(String modelType, String prevSwVersion, String newSwVersion)
            throws Exception;

    /**
     * Get individual member device configuration from Manager to be persisted in ISC. Returned blob will be downloaded
     * to appliance during registration and passed on to manager authentication script.
     *
     * @param mgrDeviceId
     *            The member device id for which configuration is to be retrieved.
     * @return
     *         Opaque byte array representing member device configuration.
     * @throws Exception
     */
    byte[] getDeviceMemberConfigById(String mgrDeviceId) throws Exception;

    /**
     * This method is used to provide device specific configuration to ISC.
     * Return Member Device Configuration stored in ISC to be downloaded to device member.
     *
     * @param Distributed
     *            Appliance Instance interface object from which stored configuration will be retrieved.
     *            {@link DistributedApplianceInstanceElement}
     * @return
     *         Opaque byte array representing member device configuration. This configuration is generated by Manager
     *         and is persisted in ISC
     */
    byte[] getDeviceMemberConfiguration(DistributedApplianceInstanceElement dai);

    /**
     * Return Member Device Configuration stored in ISC to be download to device member. This method is used to send
     * additional information which is not being provided by getDeviceMemberConfiguration()
     *
     * @param Distributed
     *            Appliance Instance interface object from which stored configuration will be retrieved.
     *            {@link DistributedApplianceInstanceElement}
     * @return Opaque byte array representing member device configuration
     */
    byte[] getDeviceMemberAdditionalConfiguration(DistributedApplianceInstanceElement dai);

    /**
     * Returns the bootstrap information. The implementor is free to add any other extra
     * data to the bootstrap information based on what the appliance needs.<br/>
     * <br/>
     *
     * For Openstack, the content will be available as a config drive under /MOUNT_POINT/openstack/content/0000
     *
     * <p>
     * This is useful, for example, for inserting ssh keys, setting configuration files, or storing data that you
     * want to retrieve from within the instance itself. It is intended to provide a minimal amount of launch-time
     * personalization.
     * </p>
     *
     */
    ApplianceBootstrapInformationElement getBootstrapinfo(BootStrapInfoProviderElement bootStrapInfo);

    @Override
    void close();
}