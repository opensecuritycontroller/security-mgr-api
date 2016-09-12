package org.osc.sdk.manager.element;

/**
 * This documents "Task"
 */
public interface TaskElement {

    /**
     * @return
     *         Task Id
     */
    Long getId();

    /**
     * @return
     */
    JobElement getJob();

    /**
     * @return
     *         Job Id. {@link JobElement}
     */
    TaskStateElement getState();

    /**
     * @return
     *         Task's current Status. {@link TaskStatusElement}
     */
    TaskStatusElement getStatus();

    /**
     * @return
     *         Task Name
     */
    String getName();

    /**
     * @return
     *         Reason explaining why this Task Failed.
     */
    Throwable getFailReason();

}
