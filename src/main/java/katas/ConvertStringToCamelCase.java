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

import java.util.*;
import java.util.stream.Collectors;

class Solution {

	static String toCamelCase(String s) {
		String result = Arrays.asList(s.split("_|-")).stream().map(w -> w.substring(0, 1).toUpperCase() + w.substring(1)).collect(Collectors.joining(""));
		return result.substring(0, 1).toLowerCase() + result.substring(1);
	}
}