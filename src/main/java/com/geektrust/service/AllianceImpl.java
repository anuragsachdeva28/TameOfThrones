package com.geektrust.service;

public class AllianceImpl implements Alliance {


    private KingdomManager kingdomManager;


    public AllianceImpl() {
        this.kingdomManager = new DefaultKingdomManager();

    }

    @Override
    public boolean checkAlliance(String kingdomName, String secretMessage) {

        return kingdomManager.checkAlliance(kingdomName, secretMessage);

    }
}
