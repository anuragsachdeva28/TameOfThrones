package com.geektrust.crypt;

public interface Encryptor {
    String encrypt(String cipherKey, String message);
}
