package com.geektrust.service;

public interface KingdomManager {
    boolean checkAlliance(String kingdomName, String secretMessage);

    void addAlliance(String senderKingdom, String receiverKingdom);

    void displayAllies(String senderKingdom);
}
