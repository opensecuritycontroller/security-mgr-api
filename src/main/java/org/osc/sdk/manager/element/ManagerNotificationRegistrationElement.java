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

/**
 * This interface represents the information needed by the
 * security managers to send notifications to OSC.
 * <p>
 * OSC retrieves this information from the security managers
 * to check whether it needs to updated its registration or create
 * a new one on the security managers.
 */
@ConsumerType
public interface ManagerNotificationRegistrationElement {
    /**
     * @return the OSC IP address known by the security manager
     */
    String getIpAddress();

    /**
     * @return the OSC port number known by the security manager
     */
    Integer getPort();

    /**
     * @return the OSC user name known by the security manager
     */
    String getUsername();

    /**
     * @return the OSC password known by the security manager
     */
    String getPassword();

    /**
     * @return the OSC relative URL used for notifications
     */
    String getRelativeURL();

    /**
     * @return the previous OSC IP address known by the security manager
     */
    String getOldIpAddress();

    /**
     * @return true if a registration was found, false otherwise
     */
    boolean isEmpty();
}
