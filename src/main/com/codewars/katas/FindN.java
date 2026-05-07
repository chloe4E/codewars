package com.codewars.katas;

/**
 * [Build a pile of Cubes]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/java
 *
 * <p>Description: Given total volume m, find the number n of cubes such that the sum of cubes from
 * 1^3 to n^3 equals m. Return -1 if no such n exists.
 */
public class FindN {

  /** Returns n such that sum of cubes 1^3..n^3 equals m, or -1. */
  public static long findNb(long m) {
    long n = 0;
    long vol = 0;

    while (vol <= m) {
      vol = vol + (long) Math.pow(n, 3);
      if (vol == m) {
        return n;
      }
      n++;
    }

    return -1;
  }
}
