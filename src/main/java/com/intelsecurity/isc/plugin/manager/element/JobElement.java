package com.intelsecurity.isc.plugin.manager.element;

/**
 * This documents "Job"
 */
public interface JobElement {

    /**
     * @return
     *         Long Job unique Identifier
     */
    public Long getId();

    /**
     * @return
     *         Job's State {@link JobStateElement}
     */
    public JobStateElement getState();

    /**
     * @return
     *         Job's Status. {@link JobStatusElement}
     */
    public JobStatusElement getStatus();

}
