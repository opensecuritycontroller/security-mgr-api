/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.sdk.manager.api;

import java.util.List;

import org.osc.sdk.manager.element.ApplianceBootstrapInformationElement;
import org.osc.sdk.manager.element.BootStrapInfoProviderElement;
import org.osc.sdk.manager.element.DistributedApplianceInstanceElement;
import org.osc.sdk.manager.element.ManagerDeviceElement;
import org.osc.sdk.manager.element.ManagerDeviceMemberElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface defines the operations used by OSC to
 * manage devices and device members in the security managers.
 */
@ConsumerType
public interface ManagerDeviceApi extends AutoCloseable {

    /**
     * @return true if the manager supports grouping device members under devices, false otherwise
     */
    boolean isDeviceGroupSupported();

    /**
     * Retrieves a device (group) from the security manager by its identifier.
     *
     * @param id  the unique identifier of the device
     * @return the device, null if not found
     * @throws Exception upon failure
     */
    ManagerDeviceElement getDeviceById(String id) throws Exception;

    /**
     * Retrieves a device (group) from the security manager by its name.
     *
     * @param name  the name of the device
     * @return the device unique identifier, null if not found
     * @throws Exception upon failure
     */
    String findDeviceByName(String name) throws Exception;

    /**
     * Retrieves all device (group) elements.
     *
     * @return the collection of all device elements
     * @throws Exception upon failure
     */
    List<? extends ManagerDeviceElement> listDevices() throws Exception;

    /**
     * Creates new device for the current virtual system.
     *
     * @return the identifier of the created device
     * @throws Exception upon failure
     */
    String createVSSDevice() throws Exception;

    /**
     * Updates the device for the current virtual system.
     *
     * @param device the device with fields to be updated
     * @throws Exception upon failure
     */
    void updateVSSDevice(ManagerDeviceElement device) throws Exception;

    /**
     * Deletes the device.
     * <p>
     * The targeted identifier is derived from the current virtual system.
     *
     * @throws Exception upon failure
     */
    void deleteVSSDevice() throws Exception;

    /**
     * Creates a device member using the context of the current virtual system.
     *
     * @param name  a unique name for member device
     * @param vserverIpAddress  the IP address of the virtualization server
     * @param contactIpAddress  in case of NAT, IPv4 privately accessible
     * @param ipAddress  the public IP address of the appliance instance
     * @param gateway  the gateway IP address of the appliance instance
     * @param prefixLength the prefix length for the subnet of the appliance instance
     * @return the unique identifier of the device member defined by the security manager
     * @throws Exception upon failure
     */
    String createDeviceMember(String name, String vserverIpAddress, String contactIpAddress,
            String ipAddress, String gateway, String prefixLength) throws Exception;

    /**
     * Updates a device member using the context of the current virtual system.
     *
     * @param deviceElement  the device member being updated
     * @param name  the new unique name of the device provided by OSC
     * @param deviceHostName  the name or IP address of the hypervisor hosting this device
     * @param ipAddress  the device immutable and unique IPv4 address
     * @param mgmtIPAddress  the device management IP address
     * @param gateway  the device gateway IP address
     * @param prefixLength  the device subnet prefix length
     * @return the identifier of the updated device
     *
     * @throws Exception upon failure
     */
    String updateDeviceMember(ManagerDeviceMemberElement deviceElement, String name,
            String deviceHostName, String ipAddress, String mgmtIPAddress, String gateway, String prefixLength)
                    throws Exception;

    /**
     * Deletes the device member given its identifier and the context of the current virtual system.
     *
     * @param id the identifier of the device to be deleted
     * @throws Exception upon failure
     */
    void deleteDeviceMember(String id) throws Exception;

    /**
     * Finds the device member given its identifier and the context of the current virtual system.
     *
     * @param id the identifier of the targeted device member
     * @return The device member, null if not found
     * @throws Exception upon failure
     */
    ManagerDeviceMemberElement getDeviceMemberById(String id) throws Exception;

    /**
     * Finds the device member given its name and the context of the current virtual system.
     *
     * @param name the name of the targeted device member
     * @return The device member, null if not found
     * @throws Exception upon failure
     */
    ManagerDeviceMemberElement findDeviceMemberByName(String name) throws Exception;

    /**
     * Retrieves the list of all device members for the current virtual system.
     *
     * @return the collection of all device members for the current virtual system
     * @throws Exception upon failure
     */
    List<? extends ManagerDeviceMemberElement> listDeviceMembers() throws Exception;

    /**
     * Checks if an appliance upgrade from a provided source version to a
     * provided target version is supported.
     *
     * @param modelType  the appliance model for which version upgrade is being checked
     * @param prevSwVersion  the software version to upgrade from
     * @param newSwVersion  the software version to upgrade to
     * @return true if upgrade is supported
     * @throws Exception upon failure
     */
    boolean isUpgradeSupported(String modelType, String prevSwVersion, String newSwVersion)
            throws Exception;

    /**
     * Gets the configuration for a given device member. The returned blob will be downloaded
     * to appliance during registration and passed on to manager authentication script.
     *
     * @param mgrDeviceId identifier of the device member
     * @return a opaque byte array representing the device member configuration
     * @throws Exception upon failure
     */
    byte[] getDeviceMemberConfigById(String mgrDeviceId) throws Exception;

    /**
     * Gets the configuration for a given device member. The returned blob will be downloaded
     * to appliance during registration and passed on to manager authentication script.
     *
     * @param dai the distributed appliance instance associated with the targeted device member
     * @return a opaque byte array representing the device member configuration
     */
    byte[] getDeviceMemberConfiguration(DistributedApplianceInstanceElement dai);

    /**
     * Gets additional configuration for a given device member. This method is used to
     * retrieve information not provided by {@link #getDeviceMemberConfiguration}.
     *
     * @param dai the distributed appliance instance associated with the targeted device member
     * @return a opaque byte array representing the device member configuration
     */
    byte[] getDeviceMemberAdditionalConfiguration(DistributedApplianceInstanceElement dai);

    /**
     * Returns the bootstrap information needed to start up the appliance.
     * <p>
     * The implementor is free to add any other extra data to the bootstrap information based on what the appliance needs.
     * <p>
     * For OpenStack, the content will be available as a config drive under /MOUNT_POINT/openstack/content/0000
     * <p>
     * This is useful, for example, for inserting SSH keys, setting configuration files, or storing data that you
     * want to retrieve from within the instance itself. It is intended to provide a minimal amount of launch-time
     * personalization.
     *
     * @param bootStrapInfo  the bootstrap data provided by OSC to the plugin,
     * the plugin may choose to augment this data.
     * @return the appliance bootstrap information
     */
    ApplianceBootstrapInformationElement getBootstrapinfo(BootStrapInfoProviderElement bootStrapInfo);

    @Override
    void close();
}
