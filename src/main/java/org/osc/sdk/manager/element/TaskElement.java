package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This documents "Task"
 */
@ProviderType
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
