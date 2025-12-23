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

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		List<String> alphabetList = Arrays.asList(alphabet.split("")).stream().collect(Collectors.toList());
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (!Character.isLetter(c)) {
				sb.append(c);
			} else {
				boolean isCapitalLetter = Character.isUpperCase(c);
				int initialIndex = alphabetList.indexOf(String.valueOf(c).toLowerCase());
				int rotIndex = ((initialIndex + 13)) % 26;

				String character = isCapitalLetter ? alphabetList.get(rotIndex).toUpperCase() : alphabetList.get(rotIndex);

				sb.append(character);
			}
		}
		return sb.toString();
	}
}