package katas;

/**
 * [Maximum subarray sum]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java
 * <p>
 * Description:
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 * <p>
 * For example:
 * <p>
 * Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6 (Sum of [4, -1, 2, 1])
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead. Your solution should be fast, it will be tested on very large arrays so slow solutions will time out.
 * <p>
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Max {
	public static int sequence(int[] arr) {

		int currentSum = 0;
		int maxSum = 0;

		for (int n : arr) {
			// Step 1: Add the new number 'n' to your currentSum
			currentSum = currentSum + n;
			// Step 2: The "Reset" check
			// If currentSum has dropped below 0, set it back to 0.
			if (currentSum < 0) {
				currentSum = 0;
			}
			// Step 3: The "Record" check
			// If currentSum is now higher than your maxSum, update maxSum.
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}

		return maxSum;
	}
}