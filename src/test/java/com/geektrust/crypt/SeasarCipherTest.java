package com.geektrust.crypt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeasarCipherTest {

    @Test
    void testSeasarCipher() {
        SeasarCipher cipher = new SeasarCipher();

        //testing for normal cases
        assertEquals("LAND", cipher.decrypt("3", cipher.encrypt("3", "LAND")));

        //checking for null string values
        assertEquals("", cipher.decrypt("3", cipher.encrypt("3", "")));

        //testing for strings with multiple word
        assertEquals("SUMMER IS COMING", cipher.decrypt("0", cipher.encrypt("0", "SUMMER IS COMING")));

        //testing for very large values of cipherKey
        assertEquals("LAND", cipher.decrypt("1500", cipher.encrypt("1500", "LAND")));

//        System.out.println(cipher.decrypt("5","FAIJWJSOOFAMAU"));
    }
}