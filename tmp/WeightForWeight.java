package katas;

/**
 * [Weight for weight]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java
 * <p>
 * Description:
 * My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.
 * <p>
 * I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.
 * <p>
 * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
 * <p>
 * Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?
 * <p>
 * Example:
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
 * <p>
 * "100 180 90 56 65 74 68 86 99"
 * When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:
 * <p>
 * 180 is before 90 since, having the same "weight" (9), it comes before as a string.
 * <p>
 * All numbers in the list are positive numbers and the list can be empty.
 */

import java.util.*;
import java.util.stream.Collectors;

public class WeightSort {

	public static String orderWeight(String strng) {
		// create a list separated by space and clean up trailing space.
		List<String> myList = Arrays.asList(strng.split(" ")).stream().map(s -> s.trim()).collect(Collectors.toList());
		System.out.println(Arrays.toString(myList.toArray()));

		myList.sort((a, b) -> {
					int weight1 = calculateSum(a);
					int weight2 = calculateSum(b);

					if (weight1 == weight2) {
						return a.compareTo(b);
					} else {
						return weight1 - weight2;
					}
				}

		);

		return String.join(" ", myList);
	}

	public static int calculateSum(String number) {
		int sum = 0;
		for (char c : number.toCharArray()) {
			sum += Character.getNumericValue(c);
		}
		return sum;

	}
}
