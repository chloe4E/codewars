package com.codewars.katas;

import java.util.HashSet;
import java.util.Set;

/**
 * [Detect Pangram]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
 *
 * <p>Description: A pangram is a sentence that contains every letter of the alphabet at least
 * once. Detect whether a given string is a pangram.
 */
public class PangramChecker {

  /** Returns true if the sentence is a pangram. */
  public boolean check(String sentence) {
    sentence = sentence.toLowerCase();
    Set<String> mySet = new HashSet<>();
    for (char s : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
      mySet.add(String.valueOf(s));
    }
    for (char letter : sentence.toCharArray()) {
      mySet.remove(String.valueOf(letter));
    }
    return mySet.isEmpty();
  }
}
