package org.osc.sdk.manager.api;

import java.util.List;

import org.osc.sdk.manager.element.DistributedApplianceInstanceElement;
import org.osc.sdk.manager.element.ManagerDeviceMemberStatusElement;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * This documents "Manager Agent Apis". This API is optional and needs to be implemented if
 * {@code ApplianceManagerApi#isAgentSupported()} returns false.
 */
@ConsumerType
public interface ManagerDeviceMemberApi {

    List<ManagerDeviceMemberStatusElement> getFullStatus(List<DistributedApplianceInstanceElement> list);

    void reAuthenticateAppliance();

    void syncAgent();


}