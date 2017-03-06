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
package org.osc.sdk.manager.api;

import java.util.HashMap;

import org.osc.sdk.manager.element.JobElement;
import org.osc.sdk.manager.element.TaskElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface defines the operations used by OSC to notify the status of jobs and tasks
 * the security manager.
 * <p>
 * OSC will only notify the status of jobs and tasks which were triggered by actions initiated by the security
 * manager. e.g. the security manager notifies OSC of changes in policies.
 * <p>
 * This API is optional and needs to be implemented only if the manager wants to be notified of job events from OSC.
 */
@ConsumerType
public interface IscJobNotificationApi extends AutoCloseable {

    /**
     * Used by OSC to report job related events
     * @param job  the job being reported
     * @throws Exception upon failure
     */
    void reportJobEvent(JobElement job) throws Exception;

    /**
     * Used by OSC to report task related events
     * @param taskNode  the task being reported
     * @param objects  the objects used by given task
     * @throws Exception upon failure
     */
    void reportJobTaskEvent(TaskElement taskNode, HashMap<String, String> objects) throws Exception;

    @Override
    void close();
}
