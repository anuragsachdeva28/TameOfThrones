package com.geektrust.service;

import com.geektrust.Util.Util;
import com.geektrust.data.Kingdom;
import com.geektrust.data.KingdomData;

import java.util.Map;

public class AllianceImpl implements Alliance {

    KingdomData kingdomData = new KingdomData();
    Util util = new Util();
    Map<String, Kingdom> kingdomMap = kingdomData.getAllKingdoms();

    @Override
    public boolean checkAlliance(String kingdomName, String secretMessage) {
        Kingdom kingdom = kingdomMap.get(kingdomName);
        String emblem = kingdom.getEmblem();
        int cipherKey = kingdom.getCipherKey();
        String encryptedEmblem = util.encryptEmblem(emblem, cipherKey);

        return util.validateMessage(encryptedEmblem, secretMessage);
    }
}
