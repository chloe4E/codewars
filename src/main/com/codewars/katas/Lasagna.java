package com.codewars.katas;

/**
 * [Lasagna]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/lasagna
 * <p>
 * Instructions:
 * [Brief description]
 */
public class Lasagna {

		int TOTAL_TIME_IN_OVEN = 40;
		int COOKING_TIME_PER_LAYER = 2;

		public int expectedMinutesInOven(){
			return TOTAL_TIME_IN_OVEN;
		}

		public int remainingMinutesInOven(int actualMinutesInOven){
			return this.expectedMinutesInOven() - actualMinutesInOven;
		}

		public int preparationTimeInMinutes(int numberOfLayers) {
			return COOKING_TIME_PER_LAYER * numberOfLayers;
		}

		public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven){
			return this.preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
		}

}