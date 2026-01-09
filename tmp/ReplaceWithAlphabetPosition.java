package katas;

/**
 * [Replace With Alphabet Position]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/546f922b54af40e1e90001da/train/java
 * <p>
 * Description:
 * In this kata you are required to, given a string, replace every letter with its position in the alphabet.
 * <p>
 * If anything in the text isn't a letter, ignore it and don't return it.
 * <p>
 * "a" = 1, "b" = 2, etc.
 */

import java.util.*;
import java.util.List;

class Kata {
	static String alphabetPosition(String text) {
		// ASCII table starts with a at position 97 and z is 122
		// for this cata we want a = 1 so we'll withdraw 96 to the ascii value

		StringBuilder sb = new StringBuilder();

		for (char c : text.toLowerCase().toCharArray()) {
			int ascii = (int) c;

			if (97 <= ascii && ascii <= 122) {
				sb.append(ascii - 96);
				sb.append(" ");
			}
		}

		return sb.toString().trim();
	}
}
