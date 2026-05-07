package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * [Binary to Text (ASCII) Conversion]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5583d268479559400d000064/train/java
 *
 * <p>Description: Write a function that takes in a binary string and returns the equivalent decoded
 * text (the text is ASCII encoded). Each 8 bits on the binary string represent 1 character on the
 * ASCII table.
 */
public class BinaryToText {

  /** Decodes a binary string to ASCII text. */
  public static String binaryToText(String binary) {
    if (Objects.equals(binary, "")) {
      return "";
    }

    List<String> binaryStringList = new ArrayList<>();
    for (int i = 0; i < binary.length(); i = i + 8) {
      binaryStringList.add(binary.substring(i, i + 8));
    }

    StringBuilder sb = new StringBuilder();
    for (String binaryString : binaryStringList) {
      int asciiCode = 0;
      int power = 7;
      for (char c : binaryString.toCharArray()) {
        int val = c - 48;
        asciiCode = asciiCode + val * (int) Math.pow(2, power);
        power = power - 1;
      }
      char ch = (char) asciiCode;
      sb.append(ch);
    }

    return sb.toString();
  }
}
