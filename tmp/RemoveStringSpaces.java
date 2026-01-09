package katas;

/**
 * [Remove String Spaces]
 * Difficulty: [8 kyu]
 * URL: https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java
 * <p>
 * Description:
 * Write a function that removes the spaces from the string, then return the resultant string.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Kata {
	public static String noSpace(final String x) {

		return Arrays.asList(x.split(" ")).stream().collect(Collectors.joining(""));
	}
}