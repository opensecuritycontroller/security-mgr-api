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
