package com.intelsecurity.isc.manager.plugin.api;


public interface ManagerWebSocketNotificationApi {

    /**
     * @return
     *         True if client is Processing message
     *         False if Client is not processing incoming messages
     *
     *         This method is used to determine weather we can close an active session or not.
     */
    public boolean isProcessingMessage();

}
