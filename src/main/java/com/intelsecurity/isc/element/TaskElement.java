package com.intelsecurity.isc.element;


public interface TaskElement {

    public Long getId();

    public JobElement getJob();

    public TaskStateElement getState();

    public TaskStatusElement getStatus();

    public String getName();

    public Throwable getFailReason();

}
