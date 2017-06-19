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

import org.osc.sdk.manager.element.MgrChangeNotification;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Web Socket Notification Apis"
 *
 * These Apis are used by ISC to manage notification registration from Manager Plugin.
 * Based on Registration Manager will notify ISC of any Domain/Policy changes.
 * This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#getNotificationType()} returns TRANSIENT_WEB_SOCKET.
 *
 */
@ConsumerType
public interface ManagerWebSocketNotificationApi extends AutoCloseable {

    /**
     * @return Port Number where server is listening to Web Socket Connection
     */
    int getPort();

    /**
     * @return provides a URL which ISC will call to connect to Web Socket Server for notifications
     *         e.g. ws://IP:port or wss://IP:port
     */
    String getUrl();

    /**
     * @return true if server supports HTTPS Web Socket Communication
     */
    boolean isHttps();

    /**
     * @return Provides additional handshake parameter. Can provide api keys or session Ids etc.
     */
    String getHandshakeParameters();

    /**
     * This will logout existing Web Socket Connection. No-op if connection does not exist
     *
     * @throws Exception
     */
    void logout() throws Exception;

    /**
     *
     * ISC will call this method to subscribe Notifications e.g. Policy, Domain etc..
     *
     * @param session
     *            web socket session. {@link Session}
     * @throws IOException
     */
    void subscribe(Session session) throws IOException;

    /**
     * @param message
     *            This helper can be used to re-interpret incoming message or to even change message format if
     *            necessary.
     * @return
     *         ManagerChangeNotification object to notify ISC of any changes. {@link MgrChangeNotification}
     */
    MgrChangeNotification translateMessage(String message);

}
