package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * [Resistor Color]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/resistor-color/edit
 *
 * <p>Instructions: Look up the numerical value associated with a resistor color band.
 */
class ResistorColor {

  /** Returns the numeric value of a resistor color band. */
  int colorCode(String color) {
    String[] colorArr = {
      "black", "brown", "red", "orange", "yellow",
      "green", "blue", "violet", "grey", "white"
    };
    List<String> colorsArrayList = new ArrayList<>(List.of(colorArr));
    return colorsArrayList.indexOf(color);
  }

  /** Returns all resistor color names in order. */
  String[] colors() {
    return new String[]{
      "black", "brown", "red", "orange", "yellow",
      "green", "blue", "violet", "grey", "white"
    };
  }
}
