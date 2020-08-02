package com.geektrust.crypt.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SeasarCipherTest {

    SeasarCipher cipher;

    @BeforeEach
    public void init() {
        cipher = new SeasarCipher();
    }

    @Test
    void testEncryptAndDecrypt() {

        assertEquals("LAND", cipher.decrypt("3", cipher.encrypt("3", "LAND")));

        assertEquals("", cipher.decrypt("3", cipher.encrypt("3", "")));

        assertEquals("SUMMER IS COMING", cipher.decrypt("0", cipher.encrypt("0", "SUMMER IS COMING")));

        assertEquals("LAND", cipher.decrypt("1500", cipher.encrypt("1500", "LAND")));

    }

    @Test
    void testDecryption() {
        assertEquals("OLWL", cipher.decrypt("3", "ROZO"));
        assertEquals("XXX", cipher.decrypt("3", "AAA"));
    }

    @Test
    void testDecryptWhenNullIsPassedAsArgs() {
        assertThrows(NullPointerException.class, () -> {
            cipher.decrypt(null, null);
        });
    }

    @Test
    void testEncryption() {
        assertEquals("ROZO", cipher.encrypt("3", "OLWL"));

        assertEquals("AAA", cipher.encrypt("3", "XXX"));

    }

    @Test
    void testEncryptWhenNullIsPassedAsArgs() {
        assertThrows(NullPointerException.class, () -> {
            cipher.encrypt(null, null);
        });
    }
}