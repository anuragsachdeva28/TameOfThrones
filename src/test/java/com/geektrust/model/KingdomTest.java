package com.geektrust.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingdomTest {

    private Kingdom kingdom;

    @BeforeEach
    void init() {
        kingdom = new Kingdom("AIR", "OWL");
    }


    @Test
    void checkSingleAddKingdom() {
        kingdom.addAlliedKingdom("LAND");
        assertEquals(new LinkedHashSet<>(Arrays.asList("AIR", "LAND")), kingdom.getAlliedKingdoms());
    }

    @Test
    void checkNullAddKingdom() {
        kingdom.addAlliedKingdom(null);
        assertEquals(new LinkedHashSet<>(Collections.singletonList("AIR")), kingdom.getAlliedKingdoms());
    }

    @Test
    void checkMultipleAddKingdom() {
        kingdom.addAlliedKingdom("WATER");
        kingdom.addAlliedKingdom("LAND");
        assertEquals(new LinkedHashSet<>(Arrays.asList("AIR", "WATER", "LAND")), kingdom.getAlliedKingdoms());
    }

    @Test
    void displayAlliesWhenAlliesAreMoreThanThree() {
        kingdom.addAlliedKingdom("SPACE");
        kingdom.addAlliedKingdom("LAND");
        kingdom.addAlliedKingdom("ICE");
        kingdom.addAlliedKingdom("WATER");
        assertEquals("AIR SPACE LAND ICE WATER", kingdom.getAllAllies());
    }

    @Test
    void displayAlliesWhenAlliesAreLessThanThree() {
        kingdom.addAlliedKingdom("SPACE");
        kingdom.addAlliedKingdom("LAND");
        assertEquals("NONE", kingdom.getAllAllies());
    }
}