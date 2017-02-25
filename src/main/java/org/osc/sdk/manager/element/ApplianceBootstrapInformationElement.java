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
 * This documents "Bootstrap information" the manager provides to the appliances.
 */
@ConsumerType
public interface ApplianceBootstrapInformationElement {

    @ConsumerType
    interface BootstrapFileElement {

        /**
         * Name of the file.
         *
         * @return
         */
        String getName();

        /**
         * For Openstack, The max size of the file contents is 10KB.
         *
         * Note that the file contents will be encoded as a Base64 string and the 10KB limit refers to the
         * number of bytes in the decoded data not the number of characters in the encoded data.
         */
        byte[] getContent();
    }

    List<BootstrapFileElement> getBootstrapFiles();

}
