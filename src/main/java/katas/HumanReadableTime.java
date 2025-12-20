package katas;

/**
 * [Human Readable Time]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
 * <p>
 * Description:
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 * <p>
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 * <p>
 * You can find some examples in the test fixtures.
 */
public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		// Do something

		int hours = seconds / 3600;

		int remain = seconds % 3600;

		int minutes = remain / 60;

		int secRemain = remain % 60;

		return String.format("%02d:%02d:%02d", hours, minutes, secRemain);
	}
}