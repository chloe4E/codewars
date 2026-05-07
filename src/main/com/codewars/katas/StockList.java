package com.codewars.katas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * [Help the bookseller!]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java
 *
 * <p>Description: Given a bookseller's stocklist and a list of categories, find the total number of
 * books per category.
 */
public class StockList {

  /** Returns a formatted summary of stock per requested category. */
  public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
    if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
      return "";
    }
    Map<String, Integer> myMap = new HashMap<>();
    for (String letter : lstOf1stLetter) {
      myMap.put(letter, 0);
    }

    for (String title : lstOfArt) {
      String firstLetter = title.substring(0, 1);
      String[] titleArr = title.split(" ");
      Integer stock = Integer.valueOf(titleArr[titleArr.length - 1]);
      if (myMap.containsKey(firstLetter)) {
        myMap.compute(firstLetter, (k, v) -> v + stock);
      }
    }

    return Arrays.stream(lstOf1stLetter)
        .map(letter -> "(" + letter + " : " + myMap.get(letter) + ")")
        .collect(Collectors.joining(" - "));
  }
}
