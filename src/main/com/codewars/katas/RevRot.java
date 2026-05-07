package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

/**
 * [Reverse or rotate?]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991/train/java
 *
 * <p>Description: Cut the string into chunks of size sz. If the sum of a chunk's digits is
 * divisible by 2, reverse it; otherwise rotate it left by one position.
 */
class RevRot {

  /** Processes the string by reversing or rotating each chunk of size sz. */
  public static String revRot(String strng, int sz) {
    if (sz <= 0 || strng.isEmpty() || sz > strng.length()) {
      return "";
    }

    List<String> stringList = new ArrayList<>();

    for (int i = 0; i <= strng.length(); i = i + sz) {
      if (i + sz > strng.length()) {
        continue;
      }
      stringList.add(strng.substring(i, i + sz));
    }

    StringBuilder sb = new StringBuilder();
    for (String s : stringList) {
      int sum = String.valueOf(s)
          .chars()
          .map(Character::getNumericValue)
          .sum();

      if (sum % 2 == 0) {
        String reversed = new StringBuilder(s).reverse().toString();
        sb.append(reversed);
      } else {
        String rotated = s.substring(1) + s.charAt(0);
        sb.append(rotated);
      }
    }
    return sb.toString();
  }

  /** Main method for manual testing. */
  public static void main(String[] args) {
    assertEquals(RevRot.revRot("1234", 0), "");
    assertEquals(RevRot.revRot("", 0), "");
    assertEquals(RevRot.revRot("1234", 5), "");
    String s = "733049910872815764";
    assertEquals(RevRot.revRot(s, 5), "330479108928157");
  }
}
