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
package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ConsumerType;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/**
 * This documents "Manager Connector"
 */
@ConsumerType
public interface ApplianceManagerConnectorElement {

    /**
     * Get Manager Connector name
     *
     * @return
     *         String given by user for Connector name
     */
    String getName();

    /**
     * Get Manager Connector IP Address
     *
     * @return
     *         String given by user for Connector IP
     */
    String getIpAddress();

    /**
     * If manager authentication method is RESTful BASIC_AUTH, this return the username to use for connection
     *
     * @return
     *         Manager Connector RESTful BASIC_AUTH username
     */
    String getUsername();

    /**
     * If manager authentication method is RESTful BASIC_AUTH, this return the password to use for connection
     *
     * @return
     *         Manager Connector RESTful BASIC_AUTH password (in the clear)
     */
    String getPassword();

    /**
     * If manager authentication method is RESTful KEY, this return the key to use for connection
     *
     * @return
     *         Manager Connector RESTful KEY (in the clear)
     */
    String getApiKey();

    /**
     * Return manager type used to register the manager plugin
     *
     * @return
     *         Unique String representing manager plugin name
     */
    ManagerTypeElement getManagerType();

    /**
     * If Manager Notification method is CALLBACK_URL, returns the last known ISC notification ip address known by the
     * manager. This is needed so that we can communicate to the MC when our IP changes to update their notification
     * mechanism instead of adding new notification registrations Can be null/empty.
     *
     * @return
     *         The last known Notification IP Address
     */
    String getLastKnownNotificationIpAddress();

    /**
     * In cases where appliance needs to get the Manager key, this return key stored in OSC
     *
     * @return
     *         Opaque array of bytes representing the key.
     */
    byte[] getPublicKey();

    /**
     * Provides the IP address of the client application (OSC) hosting the plugin.
     *
     * @return
     *         The IP address of the application (OSC) hosting the plugin.
     */
    String getClientIpAddress();

    /**
     * Provides the SSL context of the client application (OSC) hosting the plugin
     * @return
     *          The SSLContext of the application (OSC) hosting the plugin
     */
    SSLContext getSslContext();

    /**
     * Provides the Truststore manager array of the client application (OSC) hosting the plugin
     * @return
     *          The Truststore manager of the application (OSC) hosting the plugin
     */
    TrustManager[] getTruststoreManager() throws Exception;
}
