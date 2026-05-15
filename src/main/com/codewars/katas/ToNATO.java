package com.codewars.katas;

import java.util.List;
import java.util.ArrayList;

/**
 * [to NATO] Difficulty: [6 kyu] URL:
 * https://www.codewars.com/kata/586538146b56991861000293/train/java
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class ToNATO {

  public class Kata {
    public static String toNATO(String string) {
      // You can use Helper.NATO, of type: Map<Character, String>
      // usage: Helper.NATO.get('A') returns "Alfa", etc.
      List<String> myList = new ArrayList<>();

      for (char c : string.toCharArray()) {
        int ascii = Character.toUpperCase(c);
        if (ascii >= 65 && ascii <= 90) {
          myList.add(Helper.NATO.get(Character.toUpperCase(c)));
        } else if (c != ' ') {
          myList.add(String.valueOf(c));
        }
      }
      return String.join(" ", myList);
    }
  }
}
