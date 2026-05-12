package com.codewars.katas;

import java.util.HashSet;
import java.util.Set;

/**
 * [Pair of Gloves] Difficulty: [6 kyu] URL:
 * https://www.codewars.com/kata/58235a167a8cb37e1a0000db/train/java
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class PairOfGloves {

  public static int numberOfPairs(String[] gloves) {
    int count = 0;
    Set<String> colors = new HashSet<>();

    for (int i = 0; i < gloves.length; i++) {
      if (colors.contains(gloves[i])) {
        count = count + 1;
        colors.remove(gloves[i]);
      } else {
        colors.add(gloves[i]);
      }
    }
    return count;
  }
}
