package com.codewars.katas;

/**
 * [Leap]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/leap
 *
 * <p>Instructions: Determine whether a given year is a leap year. A year is a leap year if
 * divisible by 4, except for century years which must also be divisible by 400.
 */
public class Leap {

  /** Returns true if the given year is a leap year. */
  boolean isLeapYear(int year) {
    if (year % 100 == 0 && year % 400 == 0) {
      return true;
    } else {
      return year % 4 == 0;
    }
  }
}
