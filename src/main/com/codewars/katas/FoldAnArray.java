package com.codewars.katas;

import java.util.Arrays;

/**
 * [Fold an array]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/57ea70aa5500adfe8a000110/train/java
 * <p>
 * Description:
 * In this kata you have to write a method that folds a given array of integers by the middle x-times.
 * <p>
 * An example says more than thousand words:
 * <p>
 * Fold 1-times:
 * [1,2,3,4,5] -> [6,6,3]
 * <p>
 * A little visualization (NOT for the algorithm but for the idea of folding):
 * <p>
 * Step 1         Step 2        Step 3       Step 4       Step5
 * 5/           5|         5\
 * 4/            4|          4\
 * 1 2 3 4 5      1 2 3/         1 2 3|       1 2 3\       6 6 3
 * ----*----      ----*          ----*        ----*        ----*
 * <p>
 * <p>
 * Fold 2-times:
 * [1,2,3,4,5] -> [9,6]
 * As you see, if the count of numbers is odd, the middle number will stay. Otherwise the fold-point is between the middle-numbers, so all numbers would be added in a way.
 * <p>
 * The array will always contain numbers and will never be null. The parameter runs will always be a positive integer greater than 0 and says how many runs of folding your method has to do.
 * <p>
 * If an array with one element is folded, it stays as the same array.
 * <p>
 * The input array should not be modified!
 * <p>
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 * <p>
 * I have created other katas. Have a look if you like coding and challenges.
 */
public class FoldAnArray {
	public static int[] foldArray(int[] array, int runs) {
		int[] startingArr = array;
		for (int i = 0; i < runs; i++) {
			if (startingArr.length == 2) {
				int num = startingArr[0] + startingArr[1];
				return new int[]{num};
			}
			int left = 0;
			int right = startingArr.length - 1;

			int middlePoint = startingArr.length % 2 == 0 ? startingArr.length / 2 : startingArr.length / 2 + 1;
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