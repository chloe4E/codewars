package com.codewars.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * [Kata Name] Difficulty: [6 kyu] URL:
 * https://www.codewars.com/kata/52761ee4cffbc69732000738/train/java
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class GoodVsEvil {

  public static String battle(String goodAmounts, String evilAmounts) {
    int[] goodWorth = {1, 2, 3, 3, 4, 10};
    int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};
    int[] goodAmountsArr =
        Arrays.stream(goodAmounts.split(" "))
            .map(String::trim)
            .mapToInt(Integer::parseInt)
            .toArray();
    int[] evilAmountsArr =
        Arrays.stream(evilAmounts.split(" "))
            .map(String::trim)
            .mapToInt(Integer::parseInt)
            .toArray();
    int goodOnes = 0;
    int evilOnes = 0;
    for (int i = 0; i < goodAmountsArr.length; i++) {
      goodOnes = goodOnes + goodWorth[i] * goodAmountsArr[i];
    }
    for (int j = 0; j < evilAmountsArr.length; j++) {
      evilOnes = evilOnes + evilWorth[j] * evilAmountsArr[j];
    }

    if (goodOnes > evilOnes) {
      return "Battle Result: Good triumphs over Evil";
    } else if (evilOnes > goodOnes) {
      return "Battle Result: Evil eradicates all trace of Good";
    }
    return "Battle Result: No victor on this battle field";
  }
}
