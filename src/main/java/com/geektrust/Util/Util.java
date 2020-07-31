package com.geektrust.Util;

public class Util {
    final int BASE_CHAR_ASCII_INDEX = 65;
    final int TOTAL_ALPHABETS = 26;
    public String encryptEmblem(String emblem, int cipherKey) {
        String encryptedEmblem = "";
        for (char c : emblem.toCharArray()) {
            int index = (int)c - BASE_CHAR_ASCII_INDEX;
            int newIndex =  (index + cipherKey) % TOTAL_ALPHABETS;
            encryptedEmblem += (char)(newIndex + BASE_CHAR_ASCII_INDEX);
        }
        return encryptedEmblem;
    }

    public boolean validateMessage(String encryptedEmblem, String secretMessage) {

        for (char c : encryptedEmblem.toCharArray()) {
            if (secretMessage.indexOf(c) == -1) {
                return false;
            }
            else if(secretMessage.indexOf(c) >= 0) {
                secretMessage = secretMessage.substring(0, secretMessage.indexOf(c)) + secretMessage.substring(secretMessage.indexOf(c) + 1);
            }
        }
        return true;
    }


}
