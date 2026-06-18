package com.codewars.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/** Longest Substring with K Unique Characters Difficulty: 5 kyu */
@SuppressWarnings("AbbreviationAsWordInName")
public class LongestSubstringKUnique {

  /** Finds the length of the longest substring that contains no more than k unique characters. */
  public static int solution(String s, int uniqueNumberOfCharacters) {

    if (s.length() < uniqueNumberOfCharacters) {
      return s.length();
    }
    // Your solution here
    int countUnique = 0;
    int currentLen = 0;
    int maxLen = 0;
    List<Character> letters = new ArrayList<>();
    int finish = s.length();
    for (int start = 0; start < finish; start++) {
      if (s.substring(start, finish).length() < uniqueNumberOfCharacters) {
        break;
      }
      System.out.println(s.substring(start, finish));
      for (char c : s.substring(start, finish).toCharArray()) {
        System.out.println("starting for: " + c);
        if (!letters.contains(c)) {
          System.out.println("letter does not contain: " + c);
          if (letters.size() < uniqueNumberOfCharacters) {
            letters.add(c);
            currentLen = currentLen + 1;
          } else {
            maxLen = Math.max(currentLen, maxLen);
            System.out.println("maxLen: " + maxLen);
            currentLen = 0;
            letters.clear();
            break;
          }
        } else if (letters.contains(c)) {
          System.out.println("letter contains: " + c);
          currentLen = currentLen + 1;
          System.out.println("currentLen: " + currentLen);
        }
      }
    }

    return maxLen;
  }

  @Test
  void testBasicExamples() {
    assertEquals(1, LongestSubstringKUnique.solution("a", 2));
    assertEquals(4, LongestSubstringKUnique.solution("ababcde", 2));
    assertEquals(4, LongestSubstringKUnique.solution("0ababcde", 2));
    assertEquals(0, LongestSubstringKUnique.solution("", 2));
    assertEquals(6, LongestSubstringKUnique.solution("51231234321", 3));
    assertEquals(6, LongestSubstringKUnique.solution("51231234321", 3));
  }
}
