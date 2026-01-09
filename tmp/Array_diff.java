package katas;

/**
 * [Array.diff]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
 * <p>
 * Description:
 * Implement a function that computes the difference between two lists. The function should remove all occurrences of elements from the first list (a) that are present in the second list (b). The order of elements in the first list should be preserved in the result.
 */

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Kata {

	public static int[] arrayDiff(int[] a, int[] b) {
		// Your code here

		// to List
		List<Integer> aList = Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());
		Set<Integer> bSet = new HashSet<Integer>();

		for (int i = 0; i < b.length; i++) {
			bSet.add(b[i]);

		}

		//remove b
		aList = aList.stream().filter(element -> !bSet.contains(element)).toList();

		//return a
		int[] aResult = new int[aList.size()];
		aResult = aList.stream().mapToInt(Integer::intValue).toArray();
		return aResult;
	}

}


/**
 * Solution 2
 */
import java.util.Arrays;
import java.util.List;
import java.util .*;
		import java.util.stream.Collectors;

public class Kata {

	public static int[] arrayDiff2(int[] a, int[] b) {
		// Your code here
		// to List
		List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

		Set<Integer> bSet = Arrays.stream(b).boxed().collect(Collectors.toSet());


		//remove b
		int[] aResult = aList.stream().filter(element -> !bSet.contains(element)).mapToInt(Integer::intValue).toArray();

		return aResult;
	}

}