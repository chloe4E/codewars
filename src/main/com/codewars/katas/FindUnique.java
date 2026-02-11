package com.codewars.katas; /**
 * [Find the unique number]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
 * <p>
 * Description:
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * <p>
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * It’s guaranteed that array contains at least 3 numbers.
 * <p>
 * The tests contain some very huge arrays, so think about performance.
 */

public class FindUnique {

	public static double findUniq(double arr[]) {
		// Do the magic
		double rep = 0;

		if (arr[0] == arr[1]) {
			rep = arr[0];
		} else if (arr[1] == arr[2]) {
			return arr[0];
		} else {
			return arr[1];
		}

		for (double v : arr) {

			if (v != rep) {
				return v;
			}
		}
		return arr[0];
	}
}
