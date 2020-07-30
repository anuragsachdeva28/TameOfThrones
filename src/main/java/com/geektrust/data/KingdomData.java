package com.geektrust.data;

import java.util.HashMap;
import java.util.Map;

public class KingdomData {

    private Map<String, Kingdom> kingdomMap = new HashMap<>();

    public Map<String, Kingdom> getAllKingdoms() {
        kingdomMap.put("SPACE", new Kingdom("SPACE", "GORILLA"));
        kingdomMap.put("LAND", new Kingdom("LAND", "PANDA"));
        kingdomMap.put("WATER", new Kingdom("WATER", "OCTOPUS"));
        kingdomMap.put("ICE", new Kingdom("ICE", "MAMMOTH"));
        kingdomMap.put("AIR", new Kingdom("AIR", "OWL"));
        kingdomMap.put("FIRE", new Kingdom("FIRE", "DRAGON"));
        return kingdomMap;
    }
}
