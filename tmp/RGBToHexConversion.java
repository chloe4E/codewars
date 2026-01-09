package katas;

/**
 * [RGB To Hex Conversion]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/513e08acc600c94f01000001/train/java
 * <p>
 * Description:
 * The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
 * <p>
 * Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
 */
public class RgbToHex {

	public static String rgb(int r, int g, int b) {

		int clampedR = r < 0 ? 0 : r > 255 ? 255 : r;
		int clampedG = g < 0 ? 0 : g > 255 ? 255 : g;
		int clampedB = b < 0 ? 0 : b > 255 ? 255 : b;


		return String.format("%02X%02X%02X", clampedR, clampedG, clampedB);
	}
}
