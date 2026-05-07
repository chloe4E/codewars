package com.codewars.katas;

/**
 * [Two Sum]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/java
 *
 * <p>Description: Find two different items in the array that add up to the target value and return
 * their indices.
 */
public class TwoSum {

  /** Returns indices of the two numbers that add up to target. */
  public static int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[]{0, 0};
  }
}
