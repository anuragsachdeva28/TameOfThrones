package com.geektrust.util;

import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;

public final class StringUtil {

    /**
     * isSubSequence function checks whether first string is a subsequence of second string
     *
     * @param first
     * @param second
     * @return
     */
    public static boolean isSubSequence(@NonNull String first, @NonNull String second) {

        Map<Character, Integer> secondStringFreq;
        secondStringFreq = calcFreq(second);
        for (char c : first.toCharArray()) {
            if (secondStringFreq.containsKey(c)) {
                if (secondStringFreq.get(c) > 1) {
                    secondStringFreq.put(c, secondStringFreq.get(c) - 1);
                } else {
                    secondStringFreq.remove(c);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> calcFreq(@NonNull String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }


}
