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

import java.io.IOException;

import javax.websocket.Session;

import org.osc.sdk.manager.ManagerNotificationSubscriptionType;
import org.osc.sdk.manager.element.MgrChangeNotification;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface defines the operations used by OSC to manage web socket
 * notification registration.
 * <p>
 * Based on the registration the manager will notify OSC of any domain or policy
 * changes.
 * <p>
 * This API is optional and needs to be implemented only by managers
 * with notification type {@link ManagerNotificationSubscriptionType#TRANSIENT_WEB_SOCKET}.
 */
@ConsumerType
public interface ManagerWebSocketNotificationApi extends AutoCloseable {

    /**
     * @return the port number where server is listening to the web socket connection
     */
    int getPort();

    /**
     * @return the URL which OSC will call to connect to web socket server
     * for notifications, e.g. ws://IP:port or wss://IP:port
     */
    String getUrl();

    /**
     * @return true if the server supports HTTPS web socket communication
     */
    boolean isHttps();

    /**
     * @return additional handshake parameters, i.e.: API keys, session ids, etc.
     */
    String getHandshakeParameters();

    /**
     * Logout existing web socket connection. No-op if connection does not exist.
     *
     * @throws Exception upon failure
     */
    void logout() throws Exception;

    /**
     * OSC will call this method to subscribe to notifications for policies or domains.
     *
     * @param session  the web socket session
     * @throws IOException upon failure
     */
    void subscribe(Session session) throws IOException;

    /**
     * Translates a message to a notification object.
     * <p>
     * This helper can be used to re-interpret incoming message or to even change message format if necessary.
     * @param message  the message to be translated
     * @return the object to notify OSC of any changes
     */
    MgrChangeNotification translateMessage(String message);
}
