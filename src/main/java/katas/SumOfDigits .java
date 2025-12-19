package katas;

/**
 * [Sum of Digits / Digital Root]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
 * <p>
 * Description:
 * Digital root is the recursive sum of all the digits in a number.
 * <p>
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
 */

import java.util.*;

public class DRoot {
	public static int digital_root(int n) {

		Integer res = Arrays
				.asList(String.valueOf(n).split(""))
				.stream()
				.map(e -> Integer.valueOf(e))
				.reduce(0, (a, b) -> Integer.valueOf(a) + Integer.valueOf(b));

		while (res > 10) {
			res = Arrays
					.asList(String.valueOf(res).split(""))
					.stream()
					.map(e -> Integer.valueOf(e))
					.reduce(0, (a, b) -> Integer.valueOf(a) + Integer.valueOf(b));

		}
		return res;
	}
}