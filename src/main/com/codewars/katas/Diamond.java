package com.codewars.katas;

/**
 * [Give me a Diamond]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5503013e34137eeeaa001648/java
 *
 * <p>Description: Returns a string that looks like a diamond shape when printed, using asterisk
 * characters. Returns null if the input is even or negative.
 */
public class Diamond {

  /** Prints a diamond of size n, or null if n is even or negative. */
  public static String print(int n) {
    if (n < 0 || n % 2 == 0) {
      return null;
    }

    StringBuilder sb = new StringBuilder("*".repeat(n) + "\n");
    int numberOfStars = n - 2;
    int numberOfWhiteSpace = 1;
    while (numberOfStars > 0) {
      String stringSequence =
          " ".repeat(numberOfWhiteSpace) + "*".repeat(numberOfStars) + "\n";
      sb.append(stringSequence);
      sb.insert(0, stringSequence);
      numberOfStars = numberOfStars - 2;
      numberOfWhiteSpace = numberOfWhiteSpace + 1;
    }
    return sb.toString();
  }
}
