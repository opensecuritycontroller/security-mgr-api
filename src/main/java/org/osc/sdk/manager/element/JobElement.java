package org.osc.sdk.manager.element;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This documents "Job"
 */
@ProviderType
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
