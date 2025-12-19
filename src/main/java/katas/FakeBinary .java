package katas;

/**
 * [Fake Binary]
 * Difficulty: [8 kyu]
 * URL: https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
 * <p>
 * Description:
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 */

import java.util.*;
import java.util.stream.Collectors;

public class FakeBinary {
	public static String fakeBin(String numberString) {
		String fakeBinString = Arrays.asList(numberString.split("")).stream().map(e -> Integer.valueOf(e) < 5 ? "0" : "1").collect(Collectors.joining(""));
		return fakeBinString;
	}
}