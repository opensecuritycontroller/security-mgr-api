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
 * This documents Job, Task completion Notifications to Appliance Manager from ISC.
 * ISC will only notify those Jobs, task which were triggered in ISC on behalf of given Manager Connector.
 * e.g. "Propagating Policy or Configuration File to the Appliances"
 *
 * This API is optional and needs to be implemented if the manager wants to be notified of job events from ISC.
 */
@ConsumerType
public interface IscJobNotificationApi extends AutoCloseable {

    /**
     * @param job
     *            Job Element {@link JobElement}
     * @throws Exception
     */
    void reportJobEvent(JobElement job) throws Exception;

    /**
     * @param taskNode
     *            Task Element {@link TaskElement}
     * @param objects
     *            Objects used by given Task
     * @throws Exception
     */
    void reportJobTaskEvent(TaskElement taskNode, HashMap<String, String> objects) throws Exception;

    @Override
    void close();
}
