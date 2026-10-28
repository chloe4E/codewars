package com.codewars.katas;

/**
 * [Kata Name] Difficulty: [5 kyu] URL: https://www.codewars.com/kata/...
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class RoundToTheNextMultipleOf5 {

  /** Your solution here. */
  public static int roundToNext5(int number) {

    while (number % 5 != 0) {
      number = number + 1;
    }

    return number;
  }
}
