package com.codewars.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryToTextTest {
	@Test
	public void testHello() {
		assertEquals(
				"Hello",
				BinaryToText.binaryToText("0100100001100101011011000110110001101111"));
	}

	@Test
	public void testEmptyString() {
		assertEquals(
				"",
				BinaryToText.binaryToText(""));
	}

}