package com.codewars.katas;

/**
 * [Highest Scoring Word]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java
 * <p>
 * Description:
 * Given a string of words, you need to find the highest scoring word.
 * <p>
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * <p>
 * For example, the score of abad is 8 (1 + 2 + 1 + 4).
 * <p>
 * You need to return the highest scoring word as a string.
 * <p>
 * If two words score the same, return the word that appears earliest in the original string.
 * <p>
 * All letters will be lowercase and all inputs will be valid.
 */
public class High {
	public static String high(String s) {
		// Your code here...
		int highSum = 0;
		String[] strArray = s.split(" ");
		String high = strArray[0];

		for (String word : strArray) {
			int currentSum = 0;
			for (char c : word.toCharArray()) {
				int asciiVal = ((int) c) - 96;
				currentSum = currentSum + asciiVal;
			}
			if (currentSum > highSum) {
				highSum = currentSum;
				high = word;
			}
		}

		return high;
	}
}