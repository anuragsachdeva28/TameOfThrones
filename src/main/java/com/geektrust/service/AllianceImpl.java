package com.geektrust.service;

public class AllianceImpl implements Alliance {


    private KingdomManager kingdomManager;


    public AllianceImpl() {
        this.kingdomManager = new DefaultKingdomManager();

    }

    /**
     * checkAlliance method checks whether a particular kingdom will give alliance if
     * a particular secretMessage is send to him
     *
     * @param kingdomName
     * @param secretMessage
     * @return
     */
    @Override
    public boolean checkAlliance(String kingdomName, String secretMessage) {

        return kingdomManager.checkAlliance(kingdomName, secretMessage);

    }
}
