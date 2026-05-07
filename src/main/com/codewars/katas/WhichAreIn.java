package com.codewars.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * [Which are in?]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
 *
 * <p>Description: Given two arrays of strings a1 and a2, return a sorted array of the strings of
 * a1 which are substrings of strings of a2.
 */
public class WhichAreIn {

  /** Returns sorted array of strings from array1 that are substrings of any element of array2. */
  public static String[] inArray(String[] array1, String[] array2) {
    List<String> myList = new ArrayList<>();
    for (int i = 0; i < array1.length; i++) {
      final int i2 = i;
      boolean contains = Arrays.stream(array2).anyMatch(x -> x.contains(array1[i2]));
      if (contains) {
        myList.add(array1[i2]);
      }
    }
    Collections.sort(myList);
    return myList.toArray(new String[0]);
  }
}
