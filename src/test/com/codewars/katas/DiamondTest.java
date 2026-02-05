package com.codewars.katas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {
	@Test
	public void sampleTests() {
		doTest(0, null);
		doTest(-7, null);
		doTest(6, null);
		doTest(3,
				" *\n" +
						"***\n" +
						" *\n");
		doTest(5,
				"  *\n" +
						" ***\n" +
						"*****\n" +
						" ***\n" +
						"  *\n");
		doTest(15,
				"       *\n" +
						"      ***\n" +
						"     *****\n" +
						"    *******\n" +
						"   *********\n" +
						"  ***********\n" +
						" *************\n" +
						"***************\n" +
						" *************\n" +
						"  ***********\n" +
						"   *********\n" +
						"    *******\n" +
						"     *****\n" +
						"      ***\n" +
						"       *\n");
	}

	private static void doTest(int n, String expected) {
		String actual = Diamond.print(n);
		String message = "for n = " + n + "\n";
		assertEquals(expected, actual, message);
	}

}