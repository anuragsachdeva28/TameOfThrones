package com.geektrust.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingdomTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    Kingdom kingdom;

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
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        kingdom.addAlliedKingdom("SPACE");
        kingdom.addAlliedKingdom("LAND");
        kingdom.addAlliedKingdom("ICE");
        kingdom.addAlliedKingdom("WATER");
        kingdom.displayAllies();
        assertEquals("AIR SPACE LAND ICE WATER\n", outContent.toString());
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void displayAlliesWhenAlliesAreLessThanThree() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        kingdom.addAlliedKingdom("SPACE");
        kingdom.addAlliedKingdom("LAND");
        kingdom.displayAllies();
        assertEquals("NONE\n", outContent.toString());
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}