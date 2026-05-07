package com.codewars.katas;

import java.util.Arrays;

/**
 * [Fold an array]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/57ea70aa5500adfe8a000110/train/java
 *
 * <p>Description: Folds a given array of integers by the middle x-times. When folding, the two
 * halves are added element-wise.
 */
public class FoldAnArray {

  /** Returns the array after folding it runs times. */
  public static int[] foldArray(int[] array, int runs) {
    int[] startingArr = array;
    for (int i = 0; i < runs; i++) {
      if (startingArr.length == 2) {
        int num = startingArr[0] + startingArr[1];
        return new int[]{num};
      }
      int left = 0;
      int right = startingArr.length - 1;

      int middlePoint =
          startingArr.length % 2 == 0
              ? startingArr.length / 2
              : startingArr.length / 2 + 1;
      int[] foldedArr = Arrays.copyOfRange(startingArr, 0, middlePoint);
      while (left < right) {
        foldedArr[left] = startingArr[left] + startingArr[right];
        left = left + 1;
        right = right - 1;
      }
      startingArr = foldedArr;
    }
    return startingArr;
  }
}
