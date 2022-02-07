package com.dawnengine.utils;

/**
 *
 * @author alyss
 */
public class Encrypter {

    public static String encrypt(String str) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            encrypted += (char) (str.charAt(i) * 2.0 / (i + 1));
        }
        return encrypted;
    }

    public static boolean compare(String str, String encrypted) {
        return encrypt(str).equals(encrypted);
    }
}
