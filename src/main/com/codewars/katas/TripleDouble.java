package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

/**
 * [TripleDouble]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/55d5434f269c0c3f1b000058/train/java
 *
 * <p>Description: Return 1 if num1 has a triple of a digit that also appears as a double in num2,
 * otherwise return 0.
 */
public class TripleDouble {

  /** Returns 1 if any digit appears tripled in num1 and doubled in num2, else 0. */
  public static int tripleDouble(long num1, long num2) {
    ArrayList<Character> tripleArr = new ArrayList<>();
    String stringNum1 = Long.toString(num1);
    char[] charArray1 = stringNum1.toCharArray();

    for (int i = 0; i < charArray1.length - 2; i++) {
      if (charArray1[i] == charArray1[i + 1] && charArray1[i + 1] == charArray1[i + 2]) {
        if (!tripleArr.contains(charArray1[i])) {
          tripleArr.add(charArray1[i]);
        }
      }
    }

    String stringNum2 = Long.toString(num2);
    char[] charArray2 = stringNum2.toCharArray();

    for (int i = 0; i <= charArray2.length - 2; i++) {
      if (charArray2[i] == charArray2[i + 1]) {
        if (tripleArr.contains(charArray2[i])) {
          return 1;
        }
      }
    }
    return 0;
  }

  /** Main method for manual testing. */
  public static void main(String[] args) {
    assertEquals(TripleDouble.tripleDouble(111000, 100), 1);
  }
}
