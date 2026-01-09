package katas;

/**
 * [Persistent Bugger]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
 * <p>
 * Description:
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 * <p>
 * For example (Input --> Output):
 * <p>
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit, there are 3 multiplications)
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2, there are 4 multiplications)
 * 4 --> 0 (because 4 is already a one-digit number, there is no multiplication)
 */

import java.util.*;

class Persist {
	public static int persistence(long n) {
		if (n < 10) {
			return 0;
		}
		int count = 1;
		Integer res = Arrays.stream(String.valueOf(n).split("")).map(e -> Integer.valueOf(e)).reduce(1, (a, b) -> a * b);

		while (res >= 10) {
			res = Arrays.stream(String.valueOf(res).split("")).map(e -> Integer.valueOf(e)).reduce(1, (a, b) -> a * b);
			count = count + 1;
		}
		return count;

	}
}