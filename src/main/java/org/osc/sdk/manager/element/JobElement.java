package org.osc.sdk.manager.element;

/**
 * This documents "Job"
 */
public interface JobElement {

    /**
     * @return
     *         Long Job unique Identifier
     */
    Long getId();

    /**
     * @return
     *         Job's State {@link JobStateElement}
     */
    JobStateElement getState();

    /**
     * @return
     *         Job's Status. {@link JobStatusElement}
     */
    JobStatusElement getStatus();

}
