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
package org.osc.sdk.manager;

public class Constants {
    /**
     * The name of the plugin.
     */
    public static final String PLUGIN_NAME = "osc.plugin.name";

    /**
     * The name of the vendor that provides the plugin.
     */
    public static final String VENDOR_NAME = "osc.plugin.vendor_name";

    /**
     * The name of the service managed by this security manager.
     */
    public static final String SERVICE_NAME = "osc.plugin.service_name";

    /**
     * The name of the service managed by this security manager to be used when propagated to external systems.
     */
    public static final String EXTERNAL_SERVICE_NAME = "osc.plugin.external_service_name";

    /**
     * The type of authentication supported by the security manager.
     */
    public static final String AUTHENTICATION_TYPE = "osc.plugin.manager.authentication_type";

    /**
     * The type of communication used by the security manager to contact OSC.
     */
    public static final String NOTIFICATION_TYPE = "osc.plugin.manager.notification_type";

    /**
     * Indicates whether the security manager supports security group constructs and is capable of synchronizing it with OSC.
     */
    public static final String SYNC_SECURITY_GROUP = "osc.plugin.manager.sync_security_group";

    /**
     * Indicates whether the security manager can provide the status of the devices.
     */
    public static final String PROVIDE_DEVICE_STATUS = "osc.plugin.manager.provide_device_status";

    /**
     * Indicates whether the security manager can synchronize policy mapping with OSC.
     */
    public static final String SYNC_POLICY_MAPPING = "osc.plugin.manager.sync_policy_mapping";
}
