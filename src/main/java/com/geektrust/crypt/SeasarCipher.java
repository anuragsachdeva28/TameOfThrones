package com.geektrust.crypt;

public class SeasarCipher implements Decryptor, Encryptor {

    private final int BASE_CHAR_ASCII_INDEX = 65;
    private final int TOTAL_ALPHABETS = 26;
    private final int SPACE_ASCII_INDEX = 32;
    /**
     * Assumption: The SeasarCipher takes 'spaces' differently into consideration while
     * performing encryption and decryption
     *
     * @param cipherKey
     * @param message
     * @return
     */
    @Override
    public String decrypt(String cipherKey, String message) {
        StringBuilder decryptedMessage = new StringBuilder();
        for(char c : message.toCharArray()) {
            if ((int)c == SPACE_ASCII_INDEX) {
                decryptedMessage.append(c);
                continue;
            }
            int index = (int)c - BASE_CHAR_ASCII_INDEX;
            int newIndex =  (index - (Integer.parseInt(cipherKey) % TOTAL_ALPHABETS));
            if (newIndex < 0) {
                newIndex = TOTAL_ALPHABETS + newIndex;
            }
            decryptedMessage.append((char) (newIndex + BASE_CHAR_ASCII_INDEX));

        }
        return decryptedMessage.toString();
    }

    @Override
    public String encrypt(String cipherKey, String message) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            if ((int)c == SPACE_ASCII_INDEX) {
                encryptedMessage.append(c);
                continue;
            }
            int index = (int)c - BASE_CHAR_ASCII_INDEX;
            int newIndex =  (index + Integer.parseInt(cipherKey)) % TOTAL_ALPHABETS;
            encryptedMessage.append((char) (newIndex + BASE_CHAR_ASCII_INDEX));
        }
        return encryptedMessage.toString();
    }
}
