/**
 * [Build Tower]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java
 * <p>
 * Description:
 * Build Tower
 * Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.
 * <p>
 * For example, a tower with 3 floors looks like this:
 * <p>
 * [
 * "  *  ",
 * " *** ",
 * "*****"
 * ]
 * And a tower with 6 floors looks like this:
 * <p>
 * [
 * "     *     ",
 * "    ***    ",
 * "   *****   ",
 * "  *******  ",
 * " ********* ",
 * "***********"
 * ]
 */

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Kata {
	public static String[] towerBuilder(int nFloors) {
		int numberOfCharPerLevel = (nFloors * 2) - 1;

		String[] tower = new String[nFloors];

		int start = numberOfCharPerLevel / 2;
		int end = start + 1;

		for (int i = 0; i < nFloors; i++) {
			StringBuilder sb = new StringBuilder();// create an empty StringBuidler
			sb.append(StringUtils.repeat(" ", numberOfCharPerLevel));
//       System.out.printf("for level %d || start: %d, end: %d \n", i, start,end);
//       System.out.printf(" SB length : %d \n", sb.length());
//       System.out.printf("empty SB: %s \n", sb.toString());
			sb.replace(start, end, StringUtils.repeat("*", end - start));
			start = start - 1;
			end = end + 1;
//       System.out.printf("final SB for level %d: %s \n", i, sb.toString());
//       System.out.printf("final SB length : %d\n", sb.length());

			tower[i] = sb.toString();
//       System.out.println(Arrays.toString(tower));
		}
		return tower;
	}
}