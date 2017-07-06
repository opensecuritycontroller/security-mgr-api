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

import java.util.List;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface represents the information provided by the security managers
 * to be used when bootstrapping the security appliances.
 */
@ConsumerType
public interface ApplianceBootstrapInformationElement {

    /**
     * This interface represents the appliance bootstrap information
     * contained within a single file.
     */
    @ConsumerType
    interface BootstrapFileElement {

        /**
         * @return the name of the file containing the bootstrap information
         */
        String getName();

        /**
         * Retrieves the content of the file containing the bootstrap information.
         * @return the file content base64 encoded
         * For OpenStack, the max size of the file content is 10KB.
         * <p>
         * Note that the 10KB limit refers to the number of bytes in the decoded data
         * not the number of characters in the encoded data.
         */
        byte[] getContent();
    }

    /**
     * @return the collection of bootstrap files with their names and content
     */
    List<BootstrapFileElement> getBootstrapFiles();
}
