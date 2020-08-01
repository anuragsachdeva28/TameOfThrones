package com.geektrust.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilTest {

    @Test
    void isSubSequence() {
        assertTrue(StringUtil.isSubSequence("ABC", "ABCD"));
        assertFalse(StringUtil.isSubSequence("ABCD", "ABC"));
    }
}