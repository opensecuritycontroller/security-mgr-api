package org.osc.sdk.manager.element;

import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This documents "Appliance Bootstrap definition"
 */
@ProviderType
public interface BootStrapInfoProviderElement {

    String getName();

    /**
     * Returns a map of opaque key-value properties to be injected as part of bootstrapping process
     * @return
     */
    Map<String, String> getBootStrapProperties();

}
