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
 * This interface represents the asynchronous tasks used by
 * OSC to synchronize information with external services.
 * <p>
 *  Tasks are a unit of execution within a {@link JobElement}.
 */
@ProviderType
public interface TaskElement {

    /**
     * @return the identifier of the task defined by OSC
     */
    Long getId();

    /**
     * @return the parent job of this task
     */
    JobElement getJob();

    /**
     * @return the state of this task, the possible values
     * are 'NOT_RUNNING', 'QUEUED', 'PENDING', 'RUNNING' and 'COMPLETED'
     */
    TaskStateElement getState();

    /**
     * @return the status of this task, the possible values
     * are 'FAILED', 'SKIPPED', 'PASSED' and 'ABORTED'
     */
    TaskStatusElement getStatus();

    /**
     * @return the name of the task
     */
    String getName();

    /**
     * @return the details about the failure of this task if applicable
     */
    Throwable getFailReason();
}
