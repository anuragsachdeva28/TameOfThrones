package com.geektrust;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TameOfThronesApplicationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testForNoAlliedRuler() throws IOException {
        String path = "src/test/resources/input1.txt";
        TameOfThronesApplication.main(new String[]{path});

        assertEquals("NONE\n", outContent.toString());
    }

    @Test
    public void testForAlliedRulers() throws IOException {
        String path = "src/test/resources/input.txt";
        TameOfThronesApplication.main(new String[]{path});
        assertEquals("SPACE AIR LAND ICE\n", outContent.toString());
    }
}