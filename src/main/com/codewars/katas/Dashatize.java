package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * [Dashatize] Difficulty: [6 kyu] URL:
 * https://www.codewars.com/kata/58223370aef9fc03fd000071/train/java
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class Dashatize {

  public static String dashatize(int num) {

    Integer numInt = num;
    String str = numInt.toString();
    List<String> res = new ArrayList<>();

    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i, i + 1).matches("-?\\d+(\\.\\d+)?")) {
        if (Integer.parseInt(str.substring(i, i + 1)) % 2 == 0) {
          res.add(str.substring(i, i + 1));
        } else {
          if (res.size() >= 1 && res.get(res.size() - 1) != "-") {
            res.add("-");
            res.add(str.substring(i, i + 1));
            res.add("-");
          } else {
            res.add(str.substring(i, i + 1));
            res.add("-");
          }
        }
      }
    }
    String result = String.join("", res);
    result.replace("--", "-");
    if (result.charAt(0) == '-') {
      result = result.substring(1);
    }
    if (result.charAt(result.length() - 1) == '-') {
      result = result.substring(0, result.length() - 1);
    }

    return result;
  }

  public static void main(String[] args) {

    assertEquals("2-7-4", Dashatize.dashatize(274));
    assertEquals("5-3-1-1", Dashatize.dashatize(5311));
    assertEquals("86-3-20", Dashatize.dashatize(86320));
    assertEquals("9-7-4-3-02", Dashatize.dashatize(974302));
    assertEquals("0", Dashatize.dashatize(0));
    assertEquals("1", Dashatize.dashatize(-1));
    assertEquals("28-3-6-9", Dashatize.dashatize(-28369));

    assertEquals("2-1-4-7-48-3-64-7", Dashatize.dashatize(Integer.MAX_VALUE));
    assertEquals("2-1-4-7-48-3-648", Dashatize.dashatize(Integer.MIN_VALUE));
    assertEquals("1-1-1-1-1-1-1-1-1-1", Dashatize.dashatize(-1111111111));
  }
}
