package katas;

/**
 * [Greed is Good]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
 * <p>
 * Description:
 * Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. You will always be given an array with five six-sided dice values.
 * <p>
 * Three 1's => 1000 points
 * Three 6's =>  600 points
 * Three 5's =>  500 points
 * Three 4's =>  400 points
 * Three 3's =>  300 points
 * Three 2's =>  200 points
 * One   1   =>  100 points
 * One   5   =>   50 point
 * Each of 5 dice can only be counted once in each roll. For example, a given "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.
 */

import java.util.HashMap;
import java.util.Map;

public class Greed {
	public static int greedy(int[] dice) {
		//create a map for the scores and for the points
		int sum = 0;
		Map<Integer, Integer> myMap = new HashMap();
		Map<Integer, Integer> points = new HashMap();

		for (int i = 0; i < dice.length; i++) {
			myMap.compute(dice[i], (key, val)
					-> (val == null) ? 1 : val + 1);
		}

		points.put(1, 1000);
		points.put(2, 200);
		points.put(3, 300);
		points.put(4, 400);
		points.put(5, 500);
		points.put(6, 600);

		// check for 3 values & update map
		for (Integer i : myMap.keySet()) {
			System.out.println(i);
			int n = myMap.get(i) / 3;
			int remainderMap = myMap.get(i) % 3;
			Integer toAdd = points.get(i) * n;
			sum = sum + toAdd;
			myMap.put(i, remainderMap);
			System.out.println(remainderMap);
		}
		// check for 1 & 5 values
		for (Integer i : myMap.keySet()) {

			if (i == 1 || i == 5) {
				int n = myMap.get(i);
				Integer toAdd = (points.get(i) / 10) * n;
				sum = sum + toAdd;
			}

		}

		return sum;
	}
}