package katas;

/**
 * [Count the smiley faces!]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
 * <p>
 * Description:
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
 * <p>
 * Rules for a smiling face:
 * <p>
 * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
 * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
 * Every smiling face must have a smiling mouth that should be marked with either ) or D
 * No additional characters are allowed except for those mentioned.
 * <p>
 * Valid smiley face examples: :) :D ;-D :~)
 * Invalid smiley faces: ;( :> :} :]
 */

import java.util.*;

public class SmileFaces {

	public static int countSmileys(List<String> arr) {
		// Just Smile :)
		// a smiley is when first car ; or : AND last char is ) or D AND optionally in betwee we have - or ~

		int count = 0;

		for (String str : arr) {

			int len = str.length();

			if (len == 2) {
				if ((str.charAt(0) == ';' || str.charAt(0) == ':') && (str.charAt(1) == ')' || str.charAt(1) == 'D')) {

					count = count + 1;
				}
			}
			if (len == 3) {
				if ((str.charAt(0) == ';' || str.charAt(0) == ':') && (str.charAt(1) == '-' || str.charAt(1) == '~') && (str.charAt(2) == ')' || str.charAt(2) == 'D')) {
					count = count + 1;
				}
			}
		}
		return count;
	}
}