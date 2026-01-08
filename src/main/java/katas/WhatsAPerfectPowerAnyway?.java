package katas;

/**
 * [What's a Perfect Power anyway?]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/54d4c8b08776e4ad92000835/train/java
 * <p>
 * Description:
 * A perfect power is a classification of positive integers:
 * <p>
 * In mathematics, a perfect power is a positive integer that can be expressed as an integer power of another positive integer. More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that mk = n.
 * <p>
 * Your task is to check wheter a given integer is a perfect power. If it is a perfect power, return a pair m and k with mk = n as a proof. Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.
 * <p>
 * Note: For a perfect power, there might be several pairs. For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions. However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.
 * <p>
 * Examples
 * isPerfectPower(4) => new int[]{2,2}
 * isPerfectPower(5) => null
 * isPerfectPower(8) => new int[]{2,3}
 * isPerfectPower(9) => new int[]{3,2}
 */
public class PerfectPower {
	public static int[] isPerfectPower(int n) {
		double m = 1;
		double k = 1;

		while (Math.pow(m, k) <= n) {
			while (Math.pow(m, k) <= n) {
				if (Math.pow(m, k) == n) {
					return new int[]{(int) m, (int) k};
				}
				k += 1;
			}
			if (Math.pow(m, k) == n) {
				return new int[]{(int) m, (int) k};
			}
			m += 1;
		}

		return new int[]{};
	}
}