package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * [Resistor Color]
 * Difficulty: [easy ]
 * URL: https://exercism.org/tracks/java/exercises/resistor-color/edit
 * <p>
 * Instructions:
 * Instructions
 * If you want to build something using a Raspberry Pi, you'll probably use resistors. For this exercise, you need to know two things about them:
 * <p>
 * Each resistor has a resistance value.
 * Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read.
 * To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values. Each band has a position and a numeric value.
 * <p>
 * The first 2 bands of a resistor have a simple encoding scheme: each color maps to a single number.
 * <p>
 * In this exercise you are going to create a helpful program so that you don't have to remember the values of the bands.
 * <p>
 * These colors are encoded as follows:
 * <p>
 * black: 0
 * brown: 1
 * red: 2
 * orange: 3
 * yellow: 4
 * green: 5
 * blue: 6
 * violet: 7
 * grey: 8
 * white: 9
 * The goal of this exercise is to create a way:
 * <p>
 * to look up the numerical value associated with a particular color band
 * to list the different band colors
 * Mnemonics map the colors to the numbers, that, when stored as an array, happen to map to their index in the array: Better Be Right Or Your Great Big Values Go Wrong.
 * <p>
 * More information on the color encoding of resistors can be found in the Electronic color code Wikipedia article.
 */
class ResistorColor {

	private  String[] colors;

//	public ResistorColor() {
//	}

	int colorCode(String color) {
		// throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
		String[] colors = {"black","brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		List<String> colorsArrayList = new ArrayList<>(List.of(colors));
		return  colorsArrayList.indexOf(color);
	}

	String[] colors() {
		// throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
		String[] colors = {"black","brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		return colors;
	}
}
