package com.intelsecurity.isc.plugin.manager.api;

import java.util.HashMap;

import com.intelsecurity.isc.plugin.manager.element.JobElement;
import com.intelsecurity.isc.plugin.manager.element.TaskElement;


public interface IscJobNotificationApi extends AutoCloseable {

    void reportJobEvent(JobElement job) throws Exception;

    void reportJobTaskEvent(TaskElement taskNode, HashMap<String, String> objects) throws Exception;

    public abstract void close();
}
