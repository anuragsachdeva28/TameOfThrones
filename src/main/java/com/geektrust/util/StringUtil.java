package com.geektrust.util;

public final class StringUtil {
    /**
     * to check whether first string is a subsequence of second string
     * @param first
     * @param second
     * @return
     */


    public static boolean isSubSequence(String first, String second) {

        for (char c : first.toCharArray()) {
            if (second.indexOf(c) == -1) {
                return false;
            }
            else if(second.indexOf(c) >= 0) {
                second = second.substring(0, second.indexOf(c)) + second.substring(second.indexOf(c) + 1);
            }
        }
        return true;
    }


}
