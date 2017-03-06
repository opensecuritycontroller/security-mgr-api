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

import org.osgi.annotation.versioning.ProviderType;

/**
 * This interface represents the asynchronous set of activities used by
 * OSC to synchronize information with external services.
 * <p>
 *  Jobs can be triggered upon changes on the virtualized environment or by some user
 *  action.
 * This element is used by OSC to notify the security manager of the status of these jobs.
 */
@ProviderType
public interface JobElement {

    /**
     * @return the identifier of the job defined by OSC
     */
    Long getId();

    /**
     * @return the current state of the job, the possible values are 'NOT_RUNNING', 'QUEUED', 'RUNNING' and 'COMPLETED'
     */
    JobStateElement getState(); // TODO emanoel: this should be either just a string or a well defined type. the same thing for the elements below.

    /**
     * @return the current status of the job, the possible values are 'FAILED', 'PASSED' and 'ABORTED'
     */
    JobStatusElement getStatus();
}
