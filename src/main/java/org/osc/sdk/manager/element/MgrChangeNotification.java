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

/**
 * This provides functionality needed to support Manager element change Notifications.
 */
public class MgrChangeNotification {
    /**
     * This documents "Manager Object Types"
     */
    public enum MgrObjectType {
        POLICY, DOMAIN
    }

    /**
     * This documents "Object State Change"
     */
    public enum ChangeType {
        ADDED, UPDATED, DELETED
    }

    private final ChangeType changeType;
    private final MgrObjectType objectType;
    private final String objectId;

    public MgrChangeNotification(ChangeType changeType, MgrObjectType objectType, String objectId) {
        this.changeType = changeType;
        this.objectType = objectType;
        this.objectId = objectId;
    }

    /**
     * @return
     *         Type of change Notification Registered. {@link ChangeType}
     */
    public ChangeType getChangeType() {
        return changeType;
    }

    /**
     * @return
     *         Type of Object which is in context of this change Notification. {@link MgrObjectType}
     */
    public MgrObjectType getObjectType() {
        return objectType;
    }

    /**
     * @return
     *         Object Id as a String
     */
    public String getObjectId() {
        return objectId;
    }

    @Override
    public String toString() {
        return "MgrChangeNotification [changeType=" + changeType + ", objectType=" + objectType + ", objectId="
                + objectId + "]";
    }

}
