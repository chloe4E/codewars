import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

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
		double m = 2;
		double k = 2;

		while (Math.pow(m, k) <= n) {
			while (Math.pow(m, k) <= n) {
				if (Math.pow(m, k) == n) {
					System.out.println("Found: m=" + m + ", k=" + k + " for n=" + n);
					return new int[]{(int) m, (int) k};
				}
				System.out.println("Trying: m=" + m + ", k=" + k + " => " + Math.pow(m, k));
				k += 1;

			}
			System.out.println("resetting k");
			k = 2;

			if (Math.pow(m, k) == n) {
				return new int[]{(int) m, (int) k};
			}
			System.out.println("incrementing m");
			m += 1;

		}

		return null;
	}

	public static void main(String[] args) {
//			int[] pp = {51096280};//, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484};
//			for (int i: pp) assertNotNull(PerfectPower.isPerfectPower(i), i+" is a perfect power");

		// assertNull(PerfectPower.isPerfectPower(0),"0 is not a perfect number");

		assertNull(PerfectPower.isPerfectPower(51096280), "51096280 is not a perfect number");

	}
}