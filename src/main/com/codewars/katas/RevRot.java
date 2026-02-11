package com.codewars.katas; /**
 * [Reverse or rotate?]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991/train/java
 * <p>
 * Description:
 * The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).
 * <p>
 * If the sum of a chunk's digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.
 * <p>
 * If
 * <p>
 * sz is <= 0 or if str == "" return ""
 * sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
 * Examples:
 * ("123456987654", 6) --> "234561876549"
 * ("123456987653", 6) --> "234561356789"
 */

import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RevRot {

	public static String revRot(String strng, int sz) {
		// fast return
		if (sz <= 0 || strng.isEmpty() || sz > strng.length()) {
			return "";
		}

		// split string into chunk of size sz
		List<String> stringList = new ArrayList<>();

		for (int i = 0; i <= strng.length(); i = i + sz) {
			if (i + sz > strng.length()) {
				continue;
			}
			stringList.add(strng.substring(i, i + sz));
		}

		StringBuilder sb = new StringBuilder();
		for (String s : stringList) {
			// If the sum of a chunk's digits is divisible by 2, reverse that chunk
			int sum = String.valueOf(s)
					.chars()
					.map(Character::getNumericValue)
					.sum();

			if (sum % 2 == 0) {
				String reversed = new StringBuilder(s).reverse().toString();
				sb.append(reversed);
			} else {
				String rotated = s.substring(1) + s.charAt(0);
				sb.append(rotated);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("Fixed Tests: revRot");
		assertEquals(RevRot.revRot("1234", 0), "");
		assertEquals(RevRot.revRot("", 0), "");
		assertEquals(RevRot.revRot("1234", 5), "");
		String s = "733049910872815764";
		assertEquals(RevRot.revRot(s, 5), "330479108928157");
	}
}
