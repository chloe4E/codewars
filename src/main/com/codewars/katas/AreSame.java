package com.codewars.katas; /**
 * [Are they the same?]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/550498447451fbbd7600041c/java
 * <p>
 * Description:
 * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 * <p>
 * Examples
 * Valid arrays
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 * comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:
 * <p>
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 * Invalid arrays
 * If, for example, we change the first number to something else, comp is not returning true anymore:
 * <p>
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
 */

import java.util.Arrays;

public class AreSame {

	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null) {
			return false;
		}
		if (a.length != b.length) {
			return false;
		}
		int[] aSquared = Arrays.stream(a).map(x -> x * x).toArray();
		Arrays.sort(aSquared);
		Arrays.sort(b);

		// equality
		return Arrays.equals(aSquared, b);
	}
}
