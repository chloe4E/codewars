package com.codewars.katas;

/**
 * [Lasagna]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/lasagna
 *
 * <p>Instructions: [Brief description]
 */
public class Lasagna {

  int totalTimeInOven = 40;
  int cookingTimePerLayer = 2;

  /** Returns the expected total oven time in minutes. */
  public int expectedMinutesInOven() {
    return totalTimeInOven;
  }

  /** Returns the remaining oven time given how long it has already been in. */
  public int remainingMinutesInOven(int actualMinutesInOven) {
    return this.expectedMinutesInOven() - actualMinutesInOven;
  }

  /** Returns the preparation time for the given number of layers. */
  public int preparationTimeInMinutes(int numberOfLayers) {
    return cookingTimePerLayer * numberOfLayers;
  }

  /** Returns the total time: preparation plus actual oven time. */
  public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
    return this.preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
  }
}
