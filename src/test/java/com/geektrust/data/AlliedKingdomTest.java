package com.geektrust.data;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class AlliedKingdomTest {

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
        assertEquals(new ArrayList<String>(Arrays.asList("AIR","LAND")), alliedKingdom.getAlliedKingdom());
    }
}