package org.osc.sdk.manager.element;

import java.util.List;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Bootstrap information" the manager provides to the appliances
 */
@ConsumerType
public interface ApplianceBootstrapInformationElement {

    @ConsumerType
    interface BootstrapFileElement {

        /**
         * Name of the file.
         *
         * @return
         */
        String getName();

        /**
         * For Openstack, The max size of the file contents is 10KB.
         *
         * Note that the file contents will be encoded as a Base64 string and the 10KB limit refers to the
         * number of bytes in the decoded data not the number of characters in the encoded data.
         */
        byte[] getContent();
    }

    List<BootstrapFileElement> getBootstrapFiles();

}
