package com.codewars.katas;

/**
 * [Break camelCase]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
 *
 * <p>Description: Complete the solution so that the function will break up camel casing, using a
 * space between words.
 */
public class CamelCase {

  /** Inserts a space before each uppercase letter in the input string. */
  public static String camelCase(String input) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        sb.append(" ");
      }
      sb.append(input.charAt(i));
    }
    return sb.toString();
  }
}
