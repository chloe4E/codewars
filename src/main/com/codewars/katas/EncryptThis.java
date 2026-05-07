package com.codewars.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * [encryptThis]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5848565e273af816fb000449/train/java
 *
 * <p>Description: Encrypts a text by replacing the first letter of each word with its ASCII code
 * and swapping the second and last characters.
 */
public class EncryptThis {

  /** Encrypts the given text string. */
  public static String encryptThis(String text) {
    if (Objects.equals(text, "")) {
      return "";
    }
    List<String> myList = new ArrayList<>(Arrays.asList(text.split(" ")));
    List<String> result = new ArrayList<>();

    for (String word : myList) {
      StringBuilder sb = new StringBuilder(word);
      int first = word.charAt(0);
      if (word.length() < 2) {
        sb.delete(0, 1);
        sb.insert(0, first);
      } else {
        String second = String.valueOf(word.charAt(1));
        String last = String.valueOf(word.charAt(word.length() - 1));
        sb.delete(0, 1);
        sb.insert(0, first);
        sb.replace(
            String.valueOf(first).length(), String.valueOf(first).length() + 1, last);
        sb.setLength(sb.length() - 1);
        sb.append(second);
      }
      result.add(sb.toString());
    }
    return String.join(" ", result);
  }
}
