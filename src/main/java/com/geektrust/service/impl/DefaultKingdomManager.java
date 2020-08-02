package com.geektrust.service.impl;

import com.geektrust.crypt.Decryptor;
import com.geektrust.crypt.impl.SeasarCipher;
import com.geektrust.model.Kingdom;
import com.geektrust.factory.KingdomFactory;
import com.geektrust.service.KingdomManager;
import com.geektrust.util.StringUtil;
import lombok.NonNull;

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
    public boolean checkAlliance(@NonNull String kingdomName, @NonNull String secretMessage) {
        Kingdom kingdom = kingdomFactory.getKingdom(kingdomName);
        String cipherKey = kingdom.getCipherKey();
        String emblem = kingdom.getEmblem();
        String decryptedMsg = decryptor.decrypt(cipherKey, secretMessage);
        return StringUtil.isSubSequence(emblem, decryptedMsg);
    }

    @Override
    public void addAlliance(String senderKingdom, String receiverKingdom) {
        kingdomFactory.getKingdom(senderKingdom).addAlliedKingdom(receiverKingdom);
    }

    @Override
    public String getAllAllies(String senderKingdom) {
        return kingdomFactory.getKingdom(senderKingdom).getAllAllies();
    }


}
