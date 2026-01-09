package katas;

/**
 * [Count characters in your string]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/java
 * <p>
 * Description:
 * The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
 * <p>
 * What if the string is empty? Then the result should be empty object literal, {}
 */

import java.util.Map;
import java.util.HashMap;

public class Kata {
	public static Map<Character, Integer> count(String str) {
		// Happy coding!
		if (str.length() == 0) {
			return new HashMap<Character, Integer>();
		}

		Map<Character, Integer> myMap = new HashMap();

		for (char c : str.toCharArray()) {
			myMap.compute(c, (key, val)
					-> (val == null) ? 1 : val + 1);

		}
		return myMap;
	}
}