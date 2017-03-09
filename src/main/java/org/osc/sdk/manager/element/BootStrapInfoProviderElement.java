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

import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This interface represents the information provided by OSC to the manager plugin
 * when retrieving the data needed to bootstrap the appliance.
 */
@ProviderType
public interface BootStrapInfoProviderElement {

    /**
     * @return the name of the bootstrap info
     */
    String getName();

    /**
     * Used by OSC to provide additional information to the plugin.
     * The plugin can add this information to the bootstrap data returned to OSC.
     *
     * @return a map of opaque key-value properties to be injected as part of bootstrapping process
     */
    Map<String, String> getBootStrapProperties();
}
