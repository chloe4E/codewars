package katas;

/**
 * Not very secure
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/526dbd6c8c0eb53254000110/train/java
 * <p>
 * Description:
 * In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.
 * <p>
 * The string has the following conditions to be alphanumeric:
 * <p>
 * At least one character ("" is not valid)
 * Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
 * No whitespaces / underscore
 */
public class SecureTester {

	public static boolean alphanumeric(String s) {
		if (s.length() == 0) {
			return false;
		}

		for (char c : s.toCharArray()) {
			int ascii = (int) Character.toLowerCase(c);
			if ((ascii >= 97 && ascii <= 122) ||
					(ascii >= 48 && ascii <= 57)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}