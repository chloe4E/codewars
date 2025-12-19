package katas;

/**
 * [Delete occurrences of an element if it occurs more than n times]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/554ca54ffa7d91b236000023/java
 * <p>
 * Description:
 * Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times.
 * He tells them that he will only sit for the session if they show the same motif at most N times. Luckily, Alice and Bob are able to encode the motif as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
 */

import java.util.*;
import java.util.stream.Collectors;


public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		//Create a stream and a map to keep count
		List<Integer> elementsList = Arrays.stream(elements).boxed().collect(Collectors.toList());
		Map<Integer, Integer> elementsMap = Arrays.
				stream(elements).
				boxed().
				collect(Collectors.toMap(e -> e, e -> 0, (existing, replacement) -> existing));

		// filter the stream
		for (Integer element : elementsList) {
			System.out.println("start loop");
			System.out.println(String.valueOf(element));
			System.out.println(String.valueOf(elementsList));
			System.out.println("############");
			Integer current = elementsMap.get(element);
			elementsMap.put(element, current + 1);
			if (current >= maxOccurrences) {
				elementsList.remove(element);
				System.out.println("loop output");
				System.out.println(String.valueOf(elementsList));
			}
		}


		return elementsList.stream().mapToInt(Integer::intValue).toArray();
	}

}