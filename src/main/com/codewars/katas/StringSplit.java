package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 *  * [Split Strings]
 *  * Difficulty: [6 kyu]
 *  * URL: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
 *  * <p>
 *  * Description:
 *
 Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

 Examples:
 * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 */
import java.util.*;

public class StringSplit {
	public static String[] solution(String s) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			int end = i + 2;
			if (i + 2 > s.length()) {
				end = s.length();
			}

			String subString = s.substring(i, end);
			if (subString.length() != 2) {
				subString = subString.concat("_") ;
			}
			list.add(subString);
			i = i + 1;
		}
		String[] arr = list.toArray(new String[0]);
		System.out.print(Arrays.toString(arr));
		return arr;
	}

}