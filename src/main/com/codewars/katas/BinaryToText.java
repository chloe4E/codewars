package com.codewars.katas;

/**
 * [Binary to Text (ASCII) Conversio]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5583d268479559400d000064/train/java
 * <p>
 * Description:
 * Write a function that takes in a binary string and returns the equivalent decoded text (the text is ASCII encoded).
 *
 * Each 8 bits on the binary string represent 1 character on the ASCII table.
 *
 * The input string will always be a valid binary string.
 *
 * Characters can be in the range from "00000000" to "11111111" (inclusive)
 *
 * Note: In the case of an empty binary string your function should return an empty string.
 */
import java.util.List;
import java.util.ArrayList;

public class BinaryToText {
	public static String binaryToText(String binary) {
		if (binary == "") {
			return "";
		}

		// break the string into bits of 8 characters
		List<String> binaryStringList = new ArrayList<>();
		for (int i = 0; i < binary.length(); i = i + 8) {
			binaryStringList.add(binary.substring(i, i + 8));
		}
		// get the sum of the digits of the binary bit:
		StringBuilder sb = new StringBuilder();
		for (String binaryString : binaryStringList) {
			// 0100100, first digit power of 2^1 + second digit to the power of 2^2 + 3rd digit to the power of 2^4 etc.
			int sum = 0;
			int[] pow = {1, 2, 4, 8, 16, 32, 64, 128};
			int powIndex = 7;
			for (char c : binaryString.toCharArray()) {
				System.out.printf("sum: %d, powIndex: %d \n", sum, powIndex);
				int val = c - 48;
				//  d* 2^ i
				//sum= sum + val * (int) Math.pow(2,pow[powIndex]);
				sum = sum + val * pow[powIndex];
				System.out.printf("sum: %d, val: %d \n", sum, val);
				powIndex = powIndex - 1;
			}

			// convert to ascii and push to a StringBuilder
			char ch = (char) sum;
			System.out.printf("sum: %d, ch: %s", sum, ch);
			sb.append(ch);

		}

		// return as a string
		return sb.toString();
	}

}