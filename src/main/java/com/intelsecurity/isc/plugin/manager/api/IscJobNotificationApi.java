package com.intelsecurity.isc.plugin.manager.api;

import java.util.HashMap;

import com.intelsecurity.isc.plugin.manager.element.JobElement;
import com.intelsecurity.isc.plugin.manager.element.TaskElement;

/**
 * This documents Job, Task completion Notifications to Appliance Manager from ISC.
 * ISC will only notify those Jobs, task which were triggered in ISC on behalf of given Manager Connector.
 * e.g. "Propagating Policy or Configuration File to the Appliances"
 */
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
    public abstract void close();
}
