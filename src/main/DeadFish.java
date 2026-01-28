/**
 * [Make the Deadfish Swim]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java
 * <p>
 * Description:
 * It uses four single-character commands:
 * <p>
 * i: Increment the value
 * d: Decrement the value
 * s: Square the value
 * o: Output the value to a result array
 * All other instructions are no-ops and have no effect.
 * <p>
 * Examples
 * Program "iiisdoso" should return numbers [8, 64].
 * Program "iiisdosodddddiso" should return numbers [8, 64, 3600].
 */

import java.util.List;
import java.util.ArrayList;

public class DeadFish {
	public static int[] parse(String data) {
		// return new int[0]; // Implement me! :)
		List<Integer> myList = new ArrayList();
		int val = 0;

		for (char c : data.toCharArray()) {

			switch (c) {
				case 'i':
					val = val + 1;
					break;
				case 'd':
					val = val - 1;
					break;
				case 's':
					val = val * val;
					break;
				case 'o':
					myList.add(val);
					break;
			}
		}
		return myList.stream().mapToInt(i -> i).toArray();
	}
}
