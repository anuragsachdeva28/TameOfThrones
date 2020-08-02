package com.geektrust.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void isSubSequence() {
        assertTrue(StringUtil.isSubSequence("ABC", "ABCD"));
        assertFalse(StringUtil.isSubSequence("ABCD", "ABC"));
    }

    @Test
    void testIsSubSequenceOfNull() {
        assertThrows(NullPointerException.class, () -> {
            StringUtil.isSubSequence(null, null);
        });
    }
}