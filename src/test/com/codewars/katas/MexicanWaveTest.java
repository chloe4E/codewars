package com.codewars.katas;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MexicanWaveTest {

	@Test
	public void wave() {
		String[] result = new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"};
		assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("two words"));
	}
}