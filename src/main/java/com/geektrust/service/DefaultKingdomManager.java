package com.geektrust.service;

import com.geektrust.crypt.Decryptor;
import com.geektrust.crypt.SeasarCipher;
import com.geektrust.data.KingdomFactory;
import com.geektrust.util.StringUtil;

public class DefaultKingdomManager implements KingdomManager {

    private final KingdomFactory kingdomFactory;

    private Decryptor decryptor;

    public DefaultKingdomManager() {
        this.kingdomFactory = new KingdomFactory();
        this.decryptor = new SeasarCipher();
    }


    public boolean checkAlliance(String kingdomName, String secretMessage) {
        String cipherKey = kingdomFactory.getKingdom(kingdomName).getCipherKey();
        String emblem = kingdomFactory.getKingdom(kingdomName).getEmblem();
        String decryptedMsg = decryptor.decrypt(cipherKey, secretMessage);
        boolean res = StringUtil.isSubSequence(emblem, decryptedMsg);
        return res;
    }
}
