package katas;

/**
 * [Lost Lineup]
 * Difficulty: [7 kyu]
 * URL: https://www.codewars.com/kata/6914c975e159c8f7e120cc84/train/java
 * <p>
 * Description:
 * Developers were lined up at the coffee machine, but it broke! By the time they got to the backup one, they couldn't remember where people had been in the line. They want to restore the original order. The team lead, Carrol, was first. Everyone else remembers how many people had been standing between them and Carrol. Can you help them reconstruct the original order?
 * <p>
 * Input: A list or array of n non-negative integers. Element i is the number of people that person i remembers being between them and Carrol.
 * <p>
 * Output: A list or array of n non-negative integers, representing the original order. Since Carrol is first, there's no need for her to be included in the output.
 * <p>
 * Example: Suppose input is [1, 2, 0]. This means there was one person between person 1 and Carrol, two people between person 2 and Carrol, and no people between person 3 and Carrol. Therefore the original order, excluding Carrol, must have been [3, 1, 2].
 * <p>
 * Note: Since memories are fallible, people might misremember the number of people between them and Carrol. In this case there might be no solution, so return [ ].
 * <p>
 * Example: Suppose input is [1, 0, 1]. Clearly it can't be the case that both person 1 and person 3 had one person between them and Carrol.
 * <p>
 * Constraints: 1 ≤ n ≤ 100.
 */

import java.util.*;
import java.util.stream.Collectors;

public class LostLineup {

	public static int[] findLineup(final int[] distances) {

		TreeSet<Integer> sortedSet = new TreeSet<>(Arrays.stream(distances).boxed().collect(Collectors.toSet()));
		int expectedMax = sortedSet.size() - 1;

		if (sortedSet.size() != distances.length || sortedSet.first() != 0 || sortedSet.last() != expectedMax) {
			int array[] = {};
			return array;
		}

		List<Integer> myList = new ArrayList<Integer>(Collections.nCopies(distances.length, 0));


		Integer counter = 0;
		for (int personIndex : distances) {
			counter = counter + 1;
			myList.set(personIndex, counter);
		}

		return myList.stream().mapToInt(Integer::intValue).toArray();
	}
}