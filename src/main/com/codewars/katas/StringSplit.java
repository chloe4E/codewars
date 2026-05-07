package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * [Split Strings]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
 *
 * <p>Description: Split the string into pairs of two characters. If the string has an odd number of
 * characters, replace the missing second character with '_'.
 */
public class StringSplit {

  /** Returns the string split into pairs, padding the last pair with '_' if needed. */
  public static String[] solution(String s) {
    List<String> list = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      int end = i + 2;
      if (i + 2 > s.length()) {
        end = s.length();
      }

      String subString = s.substring(i, end);
      if (subString.length() != 2) {
        subString = subString.concat("_");
      }
      list.add(subString);
      i = i + 1;
    }
    return list.toArray(new String[0]);
  }
}
