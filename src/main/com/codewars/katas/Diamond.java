package com.codewars.katas;

/**
 * [Give me a Diamond]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5503013e34137eeeaa001648/java
 * <p>
 * Description:
 * Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.
 * <p>
 * Task
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 * <p>
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 * <p>
 * Examples
 * A size 3 diamond:
 * <p>
 *  *
 * ***
 *  *
 * ...which would appear as a string of " *\n***\n *\n"
 * <p>
 * A size 5 diamond:
 * <p>
 *   *
 *  ***
 * *****
 *  ***
 *   *
 * ...that is:
 * <p>
 * "  *\n ***\n*****\n ***\n  *\n"
 */
public class Diamond {

	public static String print(int n) {

		if (n < 0 || n % 2 == 0) {
			return null;
		}

		StringBuilder sb = new StringBuilder("*".repeat(n) + "\n");
		int numberOfStars = n - 2;
		int numberOfWhiteSpace = 1;
		while (numberOfStars > 0) {
			String stringSequence = " ".repeat(numberOfWhiteSpace) + "*".repeat(numberOfStars) + "\n";
			sb.append(stringSequence);
			sb.insert(0, stringSequence);
			numberOfStars = numberOfStars - 2;
			numberOfWhiteSpace = numberOfWhiteSpace + 1;
		}
		return sb.toString();
	}
}
