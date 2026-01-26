/**
 * [Kata Name]
 * Difficulty: [6 kyu]
 * URL:https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
 * <p>
 * Description:
 * Find the missing letter
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 * <p>
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 * <p>
 * Example:
 * <p>
 * ['a','b','c','d','f'] -> 'e'
 * ['O','Q','R','S'] -> 'P'
 * (Use the English alphabet with 26 letters!)
 * <p>
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 * <p>
 * I have also created other katas. Take a look if you enjoyed this kata!
 */
public class FindMissingLetter {
	public static char findMissingLetter(char[] array) {
		int ascii = (int) array[0];

		for (char c : array) {
			if ((int) c != ascii) {
				return (char) ascii;
			}
			ascii = ascii + 1;
		}
		return ' ';
	}
}