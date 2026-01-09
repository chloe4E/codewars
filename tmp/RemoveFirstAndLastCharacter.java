package katas;

/**
 * [Remove First and Last Character]
 * Difficulty: [8 kyu]
 * URL: https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
 * <p>
 * Description:
 * Remove First and Last Character
 * Task
 * Your goal is to write a function that removes the first and last characters of a string. You're given one parameter, the original string.
 * <p>
 * Important: Your function should handle strings of any length ≥ 2 characters. For strings with exactly 2 characters, return an empty string.
 */
public class RemoveChars {
	public static String remove(String str) {

		if (str.length() >= 2) {
			return str.substring(1, str.length() - 1);
		}
		return str;
	}
}
