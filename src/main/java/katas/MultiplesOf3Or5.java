package katas;
// https://www.codewars.com/kata/514b92a657cdc65150000006/java
/*
      If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

      Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

      Note: If a number is a multiple of both 3 and 5, only count it once.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public int solution(int number) {
		//TODO: Code stuff here
		List<Integer> multiples = new ArrayList<Integer>();

		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				multiples.add(i);
			}
		}

		int result = multiples.stream().reduce(0, (a, b) -> a + b);
		System.out.println(result);
		return result;
	}
}
