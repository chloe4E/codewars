package com.codewars.katas;

/**
 * [Find the unique number]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
 *
 * <p>Description: There is an array with some numbers. All numbers are equal except for one. Find
 * it.
 */
public class FindUnique {

  /** Returns the unique value in an array where all other values are equal. */
  public static double findUniq(double[] arr) {
    double rep = 0;

    if (arr[0] == arr[1]) {
      rep = arr[0];
    } else if (arr[1] == arr[2]) {
      return arr[0];
    } else {
      return arr[1];
    }

    for (double v : arr) {
      if (v != rep) {
        return v;
      }
    }
    return arr[0];
  }
}
