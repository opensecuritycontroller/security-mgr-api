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

import org.osc.sdk.manager.ManagerNotificationSubscriptionType;

/**
 * This class provides the information needed for security managers to send notifications
 * to OSC. This is applicable only for managers using the notification
 * type {@link ManagerNotificationSubscriptionType#TRANSIENT_WEB_SOCKET}
 */
public class MgrChangeNotification {
    /**
     * This enum lists the type of objects under notification.
     */
    public enum MgrObjectType {
        POLICY, DOMAIN
    }

    /**
     * This enum lists the types of changes that can be notified.
     */
    public enum ChangeType {
        ADDED, UPDATED, DELETED
    }

    private final ChangeType changeType;
    private final MgrObjectType objectType;
    private final String objectId;

    /**
     * @param changeType  the type of change being notified
     * @param objectType  the type of the entity related to the notification
     * @param objectId  the identifier of the object related to the notification
     */
    public MgrChangeNotification(ChangeType changeType, MgrObjectType objectType, String objectId) {
        this.changeType = changeType;
        this.objectType = objectType;
        this.objectId = objectId;
    }

    /**
     * @return the type of change being notified by this notification
     */
    public ChangeType getChangeType() {
        return this.changeType;
    }

    /**
     * @return the type of the entity related to the notification
     */
    public MgrObjectType getObjectType() {
        return this.objectType;
    }

    /**
     * @return the identifier of the object related to the notification
     */
    public String getObjectId() {
        return this.objectId;
    }

    @Override
    public String toString() {
        return "MgrChangeNotification [changeType=" + this.changeType + ", objectType=" + this.objectType + ", objectId="
                + this.objectId + "]";
    }
}
