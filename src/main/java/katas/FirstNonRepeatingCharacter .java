package katas;

/**
 * [First non-repeating character]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/52bc74d4ac05d0945d00054e/train/java
 * <p>
 * Description:
 * Write a function named first_non_repeating_letter† that takes a string input, and returns the first character that is not repeated anywhere in the string.
 * <p>
 * For example, if given the input 'stress', the function should return 't', since the letter t only occurs once in the string, and occurs first in the string.
 * <p>
 * As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. For example, the input 'sTreSS' should return 'T'.
 * <p>
 * If a string contains all repeating characters, it should return an empty string ("");
 * <p>
 * † Note: the function is called firstNonRepeatingLetter for historical reasons, but your function should handle any Unicode character.
 */
public class Kata {
	public static String firstNonRepeatingLetter(String s) {

		for (char c : s.toCharArray()) {

			if (s.toLowerCase().indexOf(Character.toLowerCase(c)) == s.toLowerCase().lastIndexOf(Character.toLowerCase(c))) {
				return String.valueOf(c);
			}
		}
		return "";
	}
}