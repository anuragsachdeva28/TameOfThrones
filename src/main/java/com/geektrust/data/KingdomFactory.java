package com.geektrust.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class KingdomFactory {

    private static final Map<String, Kingdom> kingdomMap = new HashMap<>();

    static {
        kingdomMap.put("SPACE", new Kingdom("SPACE", "GORILLA"));
        kingdomMap.put("LAND", new Kingdom("LAND", "PANDA"));
        kingdomMap.put("WATER", new Kingdom("WATER", "OCTOPUS"));
        kingdomMap.put("ICE", new Kingdom("ICE", "MAMMOTH"));
        kingdomMap.put("AIR", new Kingdom("AIR", "OWL"));
        kingdomMap.put("FIRE", new Kingdom("FIRE", "DRAGON"));
    }

    /**
     * getKingdom method returns the Object of a particular kingdom when the name
     * of kingdom is provided.
     *
     * @param kingdomName
     * @return
     */
    public Kingdom getKingdom(String kingdomName) {
        return Optional.ofNullable(kingdomMap.get(kingdomName)).orElseThrow(IllegalArgumentException::new);
    }
}
