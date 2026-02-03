package com.codewars.katas; /**
 * [Detect Pangram]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
 * <p>
 * Description:
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 *
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */

import java.util.HashSet;
import java.util.*;

public class PangramChecker {
	public boolean check(String sentence) {
		sentence = sentence.toLowerCase();
		// create a set with all alphabet letter
		Set<String> mySet = new HashSet();
		for (char s : "abcdefghijklmnoparstuvwxyz".toCharArray()) {
			mySet.add(String.valueOf(s));
		}
		// go through the string and delete letter from the set
		for (char letter : sentence.toCharArray()) {
			mySet.remove(String.valueOf(letter));
		}
		// check if set size is 0, return true else return false
		if (mySet.size() == 0) {
			return true;
		}
		return false;
	}
}