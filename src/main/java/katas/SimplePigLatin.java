package katas;

/**
 * [Simple Pig Latin]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/...
 * <p>
 * Description:
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * <p>
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */

import java.util.*;
import java.util.stream.Collectors;

public class PigLatin {
	public static String pigIt(String str) {
		// Write code here
		String list = Arrays.asList(str.split(" ")).stream().map(s -> new StringBuilder(s).insert(s.length(), s.substring(0, 1))).map(s -> new StringBuilder(s).delete(0, 1)).map(s -> new StringBuilder(s).append("ay")).map(s -> (int) s.toString().toLowerCase().substring(0, 1).toCharArray()[0] < 97 ? s.substring(0, 1) : s).collect(Collectors.joining(" "));

		System.out.println(String.valueOf(list));
		return list;
	}
}