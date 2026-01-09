package katas;

/**
 * [Bit Counting]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
 * <p>
 * Description:
 * Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
 */
public class BitCounting {

	public static int countBits(int n) {

		String bin = Integer.toBinaryString(n);
		int count = 0;
		for (char c : bin.toCharArray()) {
			if (c == '1') {
				count = count + 1;
			}
		}
		return count;
	}

}