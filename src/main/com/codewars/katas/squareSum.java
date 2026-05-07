package com.codewars.katas;

/**
 * [Square(n) Sum]
 * Difficulty: [8 kyu]
 * URL: https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
 *
 * <p>Description: Square each number and sum the results.
 */
public class SquareSum {

  /** Returns the sum of squares of all numbers in the array. */
  public static int squareSum(int[] n) {
    int sum = 0;
    for (int i : n) {
      sum += i * i;
    }
    return sum;
  }
}
