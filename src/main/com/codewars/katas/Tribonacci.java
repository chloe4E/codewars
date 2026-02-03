package com.codewars.katas; /**
 * [com.codewars.katas.Tribonacci Sequence]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/556deca17c58da83c00002db/train/java
 * <p>
 * Description:
 * Well met with Fibonacci bigger brother, AKA com.codewars.katas.Tribonacci.
 * <p>
 * As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(
 * <p>
 * So, if we are to start our com.codewars.katas.Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:
 * <p>
 * [1, 1 ,1, 3, 5, 9, 17, 31, ...]
 * But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci sequence by once place, you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:
 * <p>
 * [0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
 * Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that given a signature array/list, returns the first n elements - signature included of the so seeded sequence.
 * <p>
 * Signature will always contain 3 numbers; n will always be a non-negative number; if n == 0, then return an empty array (except in C return NULL) and be ready for anything else which is not clearly specified ;)
 * <p>
 * If you enjoyed this kata more advanced and generalized version of it can be found in the Xbonacci kata
 */

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Tribonacci {
	public double[] tribonacci(double[] s, int n) {
		// hackonacci me
		if (n == 0) {
			return new double[]{};
		}

		List<Double> myList = Arrays.stream(s).boxed().collect(Collectors.toList());

		for (int i = 3; i < n; i++) {
			Integer num = myList.subList(i - 3, i).stream().mapToInt(Double::intValue).sum();
			myList.add(i, Double.valueOf(num));
			System.out.println(String.valueOf(myList));
		}

		double[] array = new double[myList.size()];
		for (int i = 0; i < myList.size(); i++) array[i] = myList.get(i);
		return array;
	}
}