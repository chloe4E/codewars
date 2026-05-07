package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

/**
 * [Mexican Wave]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/solutions/java
 *
 * <p>Description: Turn a string into a Mexican Wave - return an array where each element has one
 * letter capitalized in sequence.
 */
public class MexicanWave {

  /** Returns an array of strings representing each step of the Mexican wave. */
  public static String[] wave(String str) {
    List<String> result = new ArrayList<>();

    for (int i = 0; i < str.length(); i++) {
      StringBuilder s = new StringBuilder(str);

      if (str.charAt(i) != ' ') {
        char letterToCapitalize = s.charAt(i);
        s.setCharAt(i, Character.toUpperCase(letterToCapitalize));
        result.add(s.toString());
      }
    }
    return result.toArray(String[]::new);
  }
}
