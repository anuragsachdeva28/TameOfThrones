package com.geektrust.service;

public interface Alliance {
    /**
     * @param kingdomName
     * @param secretMessage
     * @return
     */
    boolean checkAlliance(String kingdomName, String secretMessage);

    void addAlliance(String senderKingdom, String receiverKingdom);

    void displayAllies(String senderKingdom);
}
