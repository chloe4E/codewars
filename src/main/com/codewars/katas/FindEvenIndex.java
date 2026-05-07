package com.codewars.katas;

import java.util.Arrays;

/**
 * [Equal Sides Of An Array]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
 *
 * <p>Description: Find the lowest index N where the sum of the left side equals the sum of the
 * right side. Return -1 if no such index exists.
 */
public class FindEvenIndex {

  /** Returns the lowest index where left sum equals right sum, or -1. */
  public static int findEvenIndex(int[] arr) {
    int leftIndex = 0;
    int rightIndex = leftIndex + 2;

    while (rightIndex <= arr.length) {
      int[] leftArray = Arrays.copyOfRange(arr, 0, leftIndex);
      int sumLeft = Arrays.stream(leftArray).sum();

      int[] rightArray = Arrays.copyOfRange(arr, rightIndex, arr.length);
      int sumRight = Arrays.stream(rightArray).sum();

      if (sumLeft == sumRight) {
        return leftIndex;
      }
      leftIndex = leftIndex + 1;
      rightIndex = leftIndex + 1;
    }

    return -1;
  }
}
