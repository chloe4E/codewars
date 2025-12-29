package katas;

/**
 * [Counting sheep...]
 * Difficulty: [8 kyu]
 * URL: https://www.codewars.com/kata/54edbc7200b811e956000556/train/java
 * <p>
 * Description:
 * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
 * <p>
 * For example,
 * <p>
 * [true,  true,  true,  false,
 * true,  true,  true,  true ,
 * true,  false, true,  false,
 * true,  false, false, true ,
 * true,  true,  true,  true ,
 * false, false, true,  true]
 * The correct answer would be 17.
 * <p>
 * Hint: Don't forget to check for bad values like null/undefined
 */
public class Counter {
	public static int countSheeps(Boolean[] arrayOfSheeps) {
		int count = 0;
		for (int i = 0; i < arrayOfSheeps.length; i++) {
			if (arrayOfSheeps[i] == null) {
				continue;
			}
			if (arrayOfSheeps[i] == true) {
				count++;
			}
		}
		return count;
	}
}