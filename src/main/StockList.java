/**
 * [Help the bookseller !]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java
 * <p>
 * Description:
 * A bookseller has lots of books classified in 26 categories labeled A, B, C, ..., Z. Each book has a code of at least 3 characters. The 1st character of a code is a capital letter which defines the book category.
 * <p>
 * In the bookseller's stocklist each code is followed by a space and by a positive integer, which indicates the quantity of books of this code in stock.
 * <p>
 * Task
 * You will receive the bookseller's stocklist and a list of categories. Your task is to find the total number of books in the bookseller's stocklist, with the category codes in the list of categories. Note: the codes are in the same order in both lists.
 * <p>
 * Return the result as a string described in the example below, or as a list of pairs (Haskell/Clojure/Racket/Prolog).
 * <p>
 * If any of the input lists is empty, return an empty string, or an empty array/list (Clojure/Racket/Prolog).
 * <p>
 * Example
 * # the bookseller's stocklist:
 * "ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"
 * <p>
 * # list of categories:
 * "A", "B", "C", "W"
 * <p>
 * # result:
 * "(A : 20) - (B : 114) - (C : 50) - (W : 0)"
 * Explanation:
 * <p>
 * category A: 20 books (ABART)
 * category B: 114 books = 25 (BKWRK) + 89 (BTSQZ)
 * category C: 50 books (CDXEF)
 * category W: 0 books
 */

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class StockList {

	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
			return "";
		}
		// create a hashmap with the categories
		Map<String, Integer> myMap = new HashMap();
		for (String letter : lstOf1stLetter) {
			myMap.put(letter, 0);
		}

		// iterate through the stocklist and update the stock per categories

		for (String title : lstOfArt) {
			String firstLetter = title.substring(0, 1);
			String[] titleArr = title.split(" ");
			Integer stock = Integer.valueOf(titleArr[titleArr.length - 1]);
			if (myMap.containsKey(firstLetter)) {
				myMap.compute(firstLetter, (k, v) -> v + stock);
			}
		}

		return Arrays.stream(lstOf1stLetter).map(letter -> "(" + letter + " : " + myMap.get(letter) + ")").collect(Collectors.joining(" - "));
	}
}
