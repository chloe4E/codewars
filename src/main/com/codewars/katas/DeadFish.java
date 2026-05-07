package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * [Make the Deadfish Swim]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java
 *
 * <p>Description: Interprets a Deadfish program. Commands: i=increment, d=decrement, s=square,
 * o=output.
 */
public class DeadFish {

  /** Parses a Deadfish program string and returns the output values. */
  public static int[] parse(String data) {
    List<Integer> myList = new ArrayList<>();
    int val = 0;

    for (char c : data.toCharArray()) {
      switch (c) {
        case 'i':
          val = val + 1;
          break;
        case 'd':
          val = val - 1;
          break;
        case 's':
          val = val * val;
          break;
        case 'o':
          myList.add(val);
          break;
        default:
          break;
      }
    }
    return myList.stream().mapToInt(i -> i).toArray();
  }
}
