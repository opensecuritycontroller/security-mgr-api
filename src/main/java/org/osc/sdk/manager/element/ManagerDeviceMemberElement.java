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
 * This interface represents devices member created by OSC on the the security managers.
 * <p>
 * A device member is created on the security manager by OSC for each deployed security function instance.
 */
@ConsumerType
public interface ManagerDeviceMemberElement {
    /**
     * @return the identifier of the device member defined by the security manager
     */
    String getId();

    /**
     * @return the name of the device member
     */
    String getName();
}
