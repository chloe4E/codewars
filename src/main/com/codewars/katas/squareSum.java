package com.codewars.katas;

/**
 * [Square(n) Sum]
 * Difficulty: [8 kyu]
 * URL: https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
 * <p>
 * Description:
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 * <p>
 * For example, for [1, 2, 2] it should return 9 because
 * 1
 * 2
 * +
 * 2
 * 2
 * +
 * 2
 * 2
 * =
 * 9
 * 1
 * 2
 * +2
 * 2
 * +2
 * 2
 * =9.
 */
public class squareSum {
	public static int squareSum(int[] n) {
		int sum = 0;
		for (int i : n) {
			sum += i * i;
		}
		return sum;
	}
}