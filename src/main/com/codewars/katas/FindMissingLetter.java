package com.codewars.katas;

/**
 * [Find the missing letter]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
 *
 * <p>Description: Write a method that takes an array of consecutive letters and returns the missing
 * letter.
 */
public class FindMissingLetter {

  /** Returns the missing letter from a consecutive array of characters. */
  public static char findMissingLetter(char[] array) {
    int ascii = (int) array[0];

    for (char c : array) {
      if ((int) c != ascii) {
        return (char) ascii;
      }
      ascii = ascii + 1;
    }
    return ' ';
  }
}
