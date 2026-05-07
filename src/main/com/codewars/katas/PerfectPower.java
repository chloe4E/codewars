package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * [What's a Perfect Power anyway?]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/54d4c8b08776e4ad92000835/train/java
 *
 * <p>Description: Check whether a given integer is a perfect power. If it is, return a pair {m, k}
 * such that m^k = n. Otherwise return null.
 */
public class PerfectPower {

  /** Returns {m, k} such that m^k == n, or null if n is not a perfect power. */
  public static int[] isPerfectPower(int n) {
    double m = 2;
    double k = 2;

    while (Math.pow(m, k) <= n) {
      while (Math.pow(m, k) <= n) {
        if (Math.pow(m, k) == n) {
          return new int[]{(int) m, (int) k};
        }
        k += 1;
      }
      k = 2;

      if (Math.pow(m, k) == n) {
        return new int[]{(int) m, (int) k};
      }
      m += 1;
    }

    return null;
  }

  /** Main method for manual testing. */
  public static void main(String[] args) {
    assertNull(PerfectPower.isPerfectPower(51096280), "51096280 is not a perfect number");
  }
}
