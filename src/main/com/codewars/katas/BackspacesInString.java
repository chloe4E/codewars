package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * [BackspacesInString] Difficulty: [6 kyu] URL:
 * https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
 *
 * <p>Description: [Brief description]
 */
public class BackspacesInString {

  /** Returns the string after processing backspace (#) characters. */
  public String cleanString(String s) {
    ArrayList<String> myArr = new ArrayList(Arrays.asList(s.split("")));

    if (!myArr.contains("#")) {
      return s;
    }

    for (int i = 0; i < myArr.size(); i++) {
      if (myArr.get(i).equals("#") && i == 0) {
        myArr.remove(i);
        i = i - 1;
      } else if (myArr.get(i).equals("#") && i > 0) {
        myArr.subList(i - 1, i + 1).clear();
        i = i - 2;
      }
    }
    return String.join("", myArr);
  }

  /** Main method for manual testing. */
  public static void main(String[] args) {
    final BackspacesInString bis = new BackspacesInString();
    assertEquals("abc", bis.cleanString("abc"));
    assertEquals("ac", bis.cleanString("abc#d##c"));
    assertEquals("", bis.cleanString("#########"));
            assertEquals("", bis.cleanString("abc####d##c#"));
  }
}
