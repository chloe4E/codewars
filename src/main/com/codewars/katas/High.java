package com.codewars.katas;

/**
 * [Highest Scoring Word]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java
 *
 * <p>Description: Given a string of words, find the highest scoring word where each letter scores
 * its position in the alphabet (a=1, b=2, ...).
 */
public class High {

  /** Returns the highest scoring word in the string. */
  public static String high(String s) {
    int highSum = 0;
    String[] strArray = s.split(" ");
    String high = strArray[0];

    for (String word : strArray) {
      int currentSum = 0;
      for (char c : word.toCharArray()) {
        int asciiVal = ((int) c) - 96;
        currentSum = currentSum + asciiVal;
      }
      if (currentSum > highSum) {
        highSum = currentSum;
        high = word;
      }
    }

    return high;
  }
}
