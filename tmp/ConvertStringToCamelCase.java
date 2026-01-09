package katas;

/**
 * [Convert string to camel case]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
 * <p>
 * Description:
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
 * <p>
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * <p>
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * <p>
 * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

import java.lang.StringBuilder;

class Solution {

	static String toCamelCase(String s) {

		StringBuilder sb = new StringBuilder();
		boolean capitalizeNext = false;

		for (char c : s.toCharArray()) {
			if (c == '_' || c == '-') {
				capitalizeNext = true;
			} else {
				if (capitalizeNext) {
					sb.append(Character.toUpperCase(c));
					capitalizeNext = false;
				} else {
					sb.append(c);
				}
			}
		}
		return sb.toString();
	}
}