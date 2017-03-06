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

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.osc.sdk.manager.Constants;
import org.osc.sdk.manager.ManagerAuthenticationType;
import org.osc.sdk.manager.ManagerNotificationSubscriptionType;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface represents the information needed by the plugin to communicate with security manager.
 */
@ConsumerType
public interface ApplianceManagerConnectorElement {

    /**
     * @return the name of the security manager connector
     */
    String getName();

    /**
     * @return the IP address of the security manager
     */
    String getIpAddress();

    /**
     * Provides the user name for the plugin to authenticate with the security manager.
     * This is applicable only for managers using the authentication type {@link ManagerAuthenticationType#BASIC_AUTH}.
     *
     * @return the user name for authentication with the security manager, null if the authentication type is not {@link ManagerAuthenticationType#BASIC_AUTH}
     */
    String getUsername();

    /**
     * Provides the password for the plugin to authenticate with the security manager.
     * This is applicable only for managers using the authentication type {@link ManagerAuthenticationType#BASIC_AUTH}.
     *
     * @return the user password for authentication with the security manager, null if the authentication type is not {@link ManagerAuthenticationType#BASIC_AUTH}
     */
    String getPassword();

    /**
     * Provides the API key for the plugin to authenticate with the security manager.
     * This is applicable only for managers using the authentication type {@link ManagerAuthenticationType#KEY_AUTH}.
     *
     * @return the API key for authentication with the security manager,
     * null if the authentication type is not {@link ManagerAuthenticationType#KEY_AUTH}
     */
    String getApiKey();

    /**
     * Provides the name of the manager type of this connector.
     *
     * @return the type of the manager of this connector,
     * this value will match the value of the property with name {@link Constants#PLUGIN_NAME}
     */
    ManagerTypeElement getManagerType();

    /**
     * Retrieves the last OSC IP address known by the security manager.
     * This is applicable only for managers using {@link ManagerNotificationSubscriptionType#CALLBACK_URL} and
     * it is needed so OSC can updated the the security manager with its new IP address when it changes rather than
     * creating a new registration entry with the security manager.
     *
     * @return the last know OSC IP address known to the manager,
     * the value can be null for security managers that do not use {@link ManagerNotificationSubscriptionType#CALLBACK_URL}
     * or if the manager is not yet aware of OSC.
     */
    String getLastKnownNotificationIpAddress();

    /**
     * Provides the security manager public key stored in OSC.
     *
     * @return the opaque array of bytes representing the security manager public key
     */
    byte[] getPublicKey(); // TODO emanoel: This does not seem to be used anywhere. Can it be removed?

    /**
     * @return the IP address of the application (OSC) hosting the plugin
     */
    String getClientIpAddress();

    /**
     * @return the SSLContext of the application (OSC) hosting the plugin
     */
    SSLContext getSslContext();

    /**
     * @return the collection of the truststore managers of the client application (OSC) hosting the plugin
     */
    TrustManager[] getTruststoreManager() throws Exception;
}
