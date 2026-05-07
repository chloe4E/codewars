package com.codewars.katas;

/**
 * [Valid Phone Number]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java
 *
 * <p>Description: Validate whether a phone number matches the format (XXX) XXX-XXXX.
 */
public class ValidPhoneNumber {

  /** Returns true if the phone number matches the format (XXX) XXX-XXXX. */
  public static boolean validPhoneNumber(String phoneNumber) {
    String[] arr = phoneNumber.split("");
    if (!arr[0].equals("(")
        || !arr[4].equals(")")
        || !arr[5].equals(" ")
        || !arr[9].equals("-")) {
      return false;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(phoneNumber, 1, 4);
    sb.append(phoneNumber, 6, 9);
    sb.append(phoneNumber.substring(10));
    for (char c : sb.toString().toCharArray()) {
      if ((int) c > 57 || (int) c < 48) {
        return false;
      }
    }
    return true;
  }
}
