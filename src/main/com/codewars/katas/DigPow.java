package com.codewars.katas;

/**
 * [Playing with digits]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
 *
 * <p>Description: Given n and p, find k such that the sum of digits of n raised to consecutive
 * powers starting from p equals k * n. Return -1 if no such k exists.
 */
public class DigPow {

  /** Returns k if sum of digits of n raised to consecutive powers starting at p equals k*n. */
  public static long digPow(int n, int p) {
    long total = 0;

    int[] myArr = String.valueOf(n).chars().map(c -> c - '0').toArray();

    for (int j : myArr) {
      total = total + (long) Math.pow(j, p);
      p++;
    }

    if (total % n == 0) {
      return total / n;
    }
    return -1;
  }
}
