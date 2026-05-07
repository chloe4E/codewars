package com.codewars.katas;

import java.util.Arrays;

/**
 * [Are they the same?]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/550498447451fbbd7600041c/java
 *
 * <p>Description: Given two arrays a and b write a function comp(a, b) that checks whether the two
 * arrays have the "same" elements, with the same multiplicities. "Same" means that the elements in
 * b are the elements in a squared, regardless of the order.
 */
public class AreSame {

  /** Returns true if b contains the squares of all elements of a, in any order. */
  public static boolean comp(int[] a, int[] b) {
    if (a == null || b == null) {
      return false;
    }
    if (a.length != b.length) {
      return false;
    }
    int[] squared = Arrays.stream(a).map(x -> x * x).toArray();
    Arrays.sort(squared);
    Arrays.sort(b);
    return Arrays.equals(squared, b);
  }
}
