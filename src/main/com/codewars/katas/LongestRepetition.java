package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * [Kata Name] Difficulty: [6 kyu] URL:
 * https://www.codewars.com/kata/586d6cefbcc21eed7a001155/train/java
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class LongestRepetition {

  public static Object[] longestRepetition(String s) {
    int currentCount = 1;
    int maxCount = 0;

    if (s.isEmpty()) {
      return new Object[] {"", 0};
    }

    String currentChar = s.substring(0, 1);
    String maxChar = "";

    for (char c : s.substring(1).toCharArray()) {
      if (String.valueOf(c).equals(currentChar)) {
        currentCount = currentCount + 1;
      } else if (currentCount > maxCount) {
        maxCount = currentCount;
        maxChar = currentChar;
        currentCount = 1;
        currentChar = String.valueOf(c);
      } else {
        currentCount = 1;
        currentChar = String.valueOf(c);
      }
    }

    if (currentCount > maxCount) {
      maxCount = currentCount;
      maxChar = currentChar;
    }

    return new Object[] {maxChar, maxCount};
  }

  /** Main method for manual testing. */
  public static void main(String[] args) {
    assertArrayEquals(new Object[] {"a", 4}, LongestRepetition.longestRepetition("aaaabb"));
    assertArrayEquals(new Object[] {"a", 4}, LongestRepetition.longestRepetition("bbbaaabaaaa"));
    assertArrayEquals(new Object[] {"u", 3}, LongestRepetition.longestRepetition("cbdeuuu900"));
    assertArrayEquals(new Object[] {"b", 5}, LongestRepetition.longestRepetition("abbbbb"));
    assertArrayEquals(new Object[] {"a", 2}, LongestRepetition.longestRepetition("aabb"));
    assertArrayEquals(new Object[] {"", 0}, LongestRepetition.longestRepetition(""));
  }
}
