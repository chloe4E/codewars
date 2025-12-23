package katas;

/**
 * [Counting Duplicates]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 * <p>
 * Description:
 * [Brief description]
 */

import java.util.*;
import java.util.Map;
import java.util.stream.*;
import java.util.stream.Collectors;

public class CountingDuplicates {
	public static int duplicateCount(String text) {

		if (text.isEmpty()) {
			return 0;
		}
		//create a Map
		Map<String, Integer> myMap = new HashMap();

		for (char c : text.toCharArray()) {

			myMap.compute(String.valueOf(Character.toLowerCase(c)), (k, v) -> (v == null) ? 1 : v + 1);
		}

		long filtered = myMap.entrySet().stream().filter(a -> a.getValue() > 1).collect(Collectors.counting());

		return Math.max((int) filtered, 0);

	}
}