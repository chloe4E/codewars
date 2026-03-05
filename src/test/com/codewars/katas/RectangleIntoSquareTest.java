package com.codewars.katas;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import java.util.Random;

public class RectangleIntoSquareTest {

	@Test
	public void test1() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), RectangleIntoSquare.sqInRect(5, 3));
	}
	@Test
	public void test2() {
		assertEquals(null, RectangleIntoSquare.sqInRect(5, 5));
	}
}