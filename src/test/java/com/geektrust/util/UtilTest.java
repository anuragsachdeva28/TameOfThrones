package com.geektrust.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void encryptEmblem() {
        assertEquals("UFSIF", new Util().encryptEmblem("PANDA", 5));
        assertEquals("NVYPSSH",new Util().encryptEmblem("GORILLA", 7));
        assertEquals("VJAVWBZ",new Util().encryptEmblem("OCTOPUS", 7));

        //Using cipher Key different from the length of emblem.
        assertEquals("SGXSTYW",new Util().encryptEmblem("OCTOPUS", 4));

        //function should work for any string
        assertEquals("EEEEE",new Util().encryptEmblem("ZZZZZ", 5));
    }

    @Test
    void validateMessage() {
        assertEquals(true, new Util().validateMessage("UFSIF", "FAIJWJSOOFAMAU"));

        //if the secret message is null
        assertEquals(false, new Util().validateMessage("UFSIF", ""));

        //if the secret message include multiple words
        assertEquals(true, new Util().validateMessage("UFSIF", "FAIJ WJS OO FAMAU"));

        assertEquals(true, new Util().validateMessage("", "FAIJWJSOOFAMAU"));
    }
}