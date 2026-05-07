package com.codewars.katas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * [Tribonacci Sequence]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/556deca17c58da83c00002db/train/java
 *
 * <p>Description: Like Fibonacci but summing the last 3 numbers. Given a signature array and n,
 * return the first n elements of the so-seeded sequence.
 */
public class Tribonacci {

  /** Returns the first n elements of the tribonacci sequence seeded with s. */
  public double[] tribonacci(double[] s, int n) {
    if (n == 0) {
      return new double[]{};
    }

    List<Double> myList = Arrays.stream(s).boxed().collect(Collectors.toList());

    for (int i = 3; i < n; i++) {
      int num = myList.subList(i - 3, i).stream().mapToInt(Double::intValue).sum();
      myList.add(i, (double) num);
    }

    double[] array = new double[myList.size()];
    for (int i = 0; i < myList.size(); i++) {
      array[i] = myList.get(i);
    }
    return array;
  }
}
