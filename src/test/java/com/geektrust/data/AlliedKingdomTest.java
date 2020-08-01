package com.geektrust.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlliedKingdomTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    AlliedKingdom alliedKingdom;

    @BeforeEach
    public void init() {
        alliedKingdom = new AlliedKingdom();
    }

    @Test
    void checkSingleAddKingdom() {
        alliedKingdom.addKingdom("AIR");
        assertEquals(new ArrayList<String>(Collections.singletonList("AIR")), alliedKingdom.getAlliedKingdom());
    }

    @Test
    void checkNullAddKingdom() {
        alliedKingdom.addKingdom(null);
        assertEquals(new ArrayList<String>(), alliedKingdom.getAlliedKingdom());
    }

    @Test
    void checkMultipleAddKingdom() {
        alliedKingdom.addKingdom("AIR");
        alliedKingdom.addKingdom("LAND");
        assertEquals(new ArrayList<String>(Arrays.asList("AIR", "LAND")), alliedKingdom.getAlliedKingdom());
    }

    @Test
    void displayAlliesWhenAlliesAreMoreThanThree() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        alliedKingdom.addKingdom("AIR");
        alliedKingdom.addKingdom("LAND");
        alliedKingdom.addKingdom("ICE");
        alliedKingdom.addKingdom("WATER");
        alliedKingdom.displayAllies();
        assertEquals("SPACE AIR LAND ICE WATER\n", outContent.toString());
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void displayAlliesWhenAlliesAreLessThanThree() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        alliedKingdom.addKingdom("AIR");
        alliedKingdom.addKingdom("LAND");
        alliedKingdom.displayAllies();
        assertEquals("NONE\n", outContent.toString());
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}