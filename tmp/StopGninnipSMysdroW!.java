package katas;

/**
 * [Stop gninnipS My sdroW!]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
 * <p>
 * Description:
 * Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (just like the name of this kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 */

import java.util.*;
import java.util.stream.Collectors;

public class SpinWords {

	public String spinWords(String sentence) {

		String result = Arrays.asList(sentence.split(" ")).stream().map(e -> e.length() >= 5 ? new StringBuilder(e).reverse().toString() : e).collect(Collectors.joining(" "));
		return result;
	}
}