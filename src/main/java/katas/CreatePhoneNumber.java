package katas;

/**
 * [Create Phone Number]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * <p>
 * Description:
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 * <p>
 * Example
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */

import java.util.*;
import java.util.stream.Collectors;


public class Kata {
	public static String createPhoneNumber(int[] numbers) {
		String numbersAsString = Arrays.stream(numbers).boxed().map(e -> String.valueOf(e)).collect(Collectors.joining());

		StringBuilder sb = new StringBuilder(numbersAsString);

		//proceed to modifications:
		sb.insert(0, "(");
		sb.insert(4, ") ");
		sb.insert(9, "-");
		return sb.toString();
	}
}