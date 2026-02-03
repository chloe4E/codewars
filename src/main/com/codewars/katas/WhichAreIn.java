package com.codewars.katas; /**
 * [Which are in?]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
 * <p>
 * Description:
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * <p>
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns ["arp", "live", "strong"]
 */

import java.util.*;
import java.util.List;

public class WhichAreIn {

	public static String[] inArray(String[] array1, String[] array2) {
		List<String> myList = new ArrayList();
		for (int i = 0; i < array1.length; i++) {
			final int i2 = i;
			boolean contains = Arrays.stream(array2).anyMatch(x -> x.contains(array1[i2]));
			System.out.print(array1[i2]);
			if (contains) {
				myList.add(array1[i2]);
			}
		}
		Collections.sort(myList);
		String[] myArr = myList.toArray(new String[0]);
		return myArr;
	}
}
