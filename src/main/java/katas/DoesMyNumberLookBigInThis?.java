package katas;

/**
 * [Does my number look big in this?]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java
 * <p>
 * Description:
 * A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).
 * <p>
 * For example, take 153 (3 digits), which is narcissistic:
 * <p>
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * and 1652 (4 digits), which isn't:
 * <p>
 * 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
 * The Challenge:
 * <p>
 * Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number in base 10.
 */
public class NumberUtils {

	public static boolean isNarcissistic(int number) {
		int power = String.valueOf(number).length();
		int sum = 0;

		for (char c : String.valueOf(number).toCharArray()) {
			int n = c - '0';
			Double toAdd = Math.pow(n, power);
			sum = sum + toAdd.intValue();
		}

		if (sum == number) {
			return true;
		}
		return false;

	}

}