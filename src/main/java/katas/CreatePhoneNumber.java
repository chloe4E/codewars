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
public class Kata {
	public static String createPhoneNumber(int[] numbers) {
		// Your code here!
		return "(" + String.valueOf(numbers[0])
				+ String.valueOf(numbers[1])
				+ String.valueOf(numbers[2])
				+ ") "
				+ String.valueOf(numbers[3])
				+ String.valueOf(numbers[4])
				+ String.valueOf(numbers[5])
				+ "-"
				+ String.valueOf(numbers[6])
				+ String.valueOf(numbers[7])
				+ String.valueOf(numbers[8])
				+ String.valueOf(numbers[9]);
	}
}