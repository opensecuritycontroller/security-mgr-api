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
 * This interface represents the security groups defined in OSC.
 * <p>
 * The assets under protection are grouped in OSC through security groups.
 */
@ConsumerType
public interface ManagerSecurityGroupElement {
    /**
     * @return the identifier of the security group defined by the manager
     */
    String getSGId();

    /**
     * @return the name of the security group defined in OSC
     */
    String getName();
}
