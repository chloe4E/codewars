/**
 * [Kata Name]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/...
 * <p>
 * Description:
 * [Brief description]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MexicanWave {

	public static String[] wave(String str) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			StringBuilder s = new StringBuilder(str);

			if (str.charAt(i) != ' ') {
				char letterToCapitalize = s.charAt(i);
				s.setCharAt(i, Character.toUpperCase(letterToCapitalize));
				result.add(s.toString());
			}
		}
		return result.toArray(String[]::new);
	}

	public static void main(String[] args) {
		String[] result = new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"};
		assertArrayEquals(result, MexicanWave.wave("two words"), "it should return '" + Arrays.toString(result) + "'");

	}

}