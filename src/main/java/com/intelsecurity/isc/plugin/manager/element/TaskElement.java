package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Task"
 */
public interface TaskElement {

    /**
     * @return
     *         Task Id
     */
    public Long getId();

    /**
     * @return
     */
    public JobElement getJob();

    /**
     * @return
     *         Job Id. {@link JobElement}
     */
    public TaskStateElement getState();

    /**
     * @return
     *         Task's current Status. {@link TaskStatusElement}
     */
    public TaskStatusElement getStatus();

    /**
     * @return
     *         Task Name
     */
    public String getName();

    /**
     * @return
     *         Reason explaining why this Task Failed.
     */
    public Throwable getFailReason();

}
