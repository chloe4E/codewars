package com.codewars.katas; /**
 * [Equal Sides Of An Array]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
 * <p>
 * Description:
 * Input
 * An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.
 * <p>
 * Output
 * The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not find an index that fits these rules, then you will return -1.
 * <p>
 * Note
 * If you are given an array with multiple answers, return the lowest correct index.
 */

import java.util.Arrays;

public class FindEvenIndex {

	public static int findEvenIndex(int[] arr) {
		// start at index 0 and 2
		int leftIndex = 0;
		int rightIndex = leftIndex + 2;
		// create 2 sums and compare them

		while (rightIndex <= arr.length) {

			int[] leftArray = Arrays.copyOfRange(arr, 0, leftIndex);
			int sumLeft = Arrays.stream(leftArray).sum();

			// System.out.println(Arrays.toString(leftArray));

			int[] rightArray = Arrays.copyOfRange(arr, rightIndex, arr.length);
			int sumRight = Arrays.stream(rightArray).sum();

			//  System.out.println(Arrays.toString(rightArray));

			System.out.printf("Sum left: %d and Sum right: %d \n", sumLeft, sumRight);

			if (sumLeft == sumRight) {
				return leftIndex;
			}
			// move the index
			leftIndex = leftIndex + 1;
			rightIndex = leftIndex + 1;
		}

		return -1;
	}
}
