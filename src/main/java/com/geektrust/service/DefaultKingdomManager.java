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
        String cipherKey = kingdomFactory.getKingdom(kingdomName).getCipherKey();
        String emblem = kingdomFactory.getKingdom(kingdomName).getEmblem();
        String decryptedMsg = decryptor.decrypt(cipherKey, secretMessage);
        return StringUtil.isSubSequence(emblem, decryptedMsg);
    }
}
