package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * [Buying a car] Difficulty: [6 kyu] URL:
 * https://www.codewars.com/kata/554a44516729e4d80b000012/train/java
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class BuyCar {

  public static int[] nbMonths(
      int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
    // your code
    double currentCarValue = startPriceOld;
    double newCarPrice = startPriceNew;
    int savings = 0;
    int nbMonths = 0;
    double currentPercentLossByMonth = percentLossByMonth;

    while (newCarPrice > (currentCarValue + savings)) {
      nbMonths = nbMonths + 1;
      if (nbMonths % 2 == 0) {
        currentPercentLossByMonth = currentPercentLossByMonth + 0.5;
      }
      currentCarValue = currentCarValue * (100 - currentPercentLossByMonth) / 100;
      newCarPrice = newCarPrice * (100 - currentPercentLossByMonth) / 100;
      savings = savings + savingperMonth;
    }
    int leftover = (int) Math.round((currentCarValue + savings) - newCarPrice);
    return new int[] {nbMonths, leftover};
  }

  public static void main(String[] args) {
    int[] r = new int[] {6, 766};
    assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
  }
}
