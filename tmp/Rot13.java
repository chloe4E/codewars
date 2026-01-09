package katas;

/**
 * [Rot 13]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/530e15517bc88ac656000716/train/java
 * <p>
 * Description:
 * ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet. ROT13 is an example of the Caesar cipher.
 * <p>
 * Create a function that takes a string and returns the string ciphered with Rot13. If there are numbers or special characters included in the string, they should be returned as they are. Only letters from the latin/english alphabet should be shifted, like in the original Rot13 "implementation".
 */

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
	public static String rot13(String str) {
		// Your code goes here.
		// check is letter use string builder
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (!Character.isLetter(c)) {
				sb.append(c);
			} else {
				char base = Character.isUpperCase(c) ? 'A' : 'a';
				int originalPos = c - base;
				int rotIndex = (((originalPos + 13)) % 26) + base;
				char shifted = (char) rotIndex;
				sb.append(shifted);
			}
		}
		return sb.toString();
	}
}