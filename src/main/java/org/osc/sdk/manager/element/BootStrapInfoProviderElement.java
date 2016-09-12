package org.osc.sdk.manager.element;

import java.util.Map;

/**
 * This documents "Appliance Bootstrap definition"
 */
public interface BootStrapInfoProviderElement {

    String getName();

    /**
     * Returns a map of opaque key-value properties to be injected as part of bootstrapping process
     * @return
     */
    Map<String, String> getBootStrapProperties();

}
