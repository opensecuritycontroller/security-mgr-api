package com.intelsecurity.isc.manager.plugin.api;

import java.util.HashMap;

import com.intelsecurity.isc.element.JobElement;
import com.intelsecurity.isc.element.TaskElement;


public interface IscJobNotificationApi {

    void reportJobEvent(JobElement job) throws Exception;

    void reportJobTaskEvent(TaskElement taskNode, HashMap<String, String> objects) throws Exception;

}
