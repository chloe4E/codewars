package com.codewars.katas;

/**
 * [High Scores]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/high-scores
 * <p>
 * Description:
 * <p>
 * Instructions
 * Manage a game player's High Score list.
 * <p>
 * Your task is to build a high-score component of the classic Frogger game, one of the highest selling and most addictive games of all time, and a classic of the arcade era. Your task is to write methods that return the highest score from the list, the last added score and the three highest scores.
 */

import java.util.ArrayList;
import java.util.List;

public class HighScores {
	private final List<Integer> highScores;

	public HighScores(List<Integer> highScores) {
		this.highScores = new ArrayList<>(highScores);
	}

	List<Integer> scores() {
		return this.highScores;
	}

	Integer latest() {
		return this.highScores.getLast();
	}

	Integer personalBest() {
		return this.highScores.stream().mapToInt(e -> e).max().orElseThrow();
	}

	List<Integer> personalTopThree() {
		List<Integer> sortedHighScore = new ArrayList<>(this.highScores);
		sortedHighScore.sort((a, b) -> {
			return b - a;
		});
		return sortedHighScore.subList(0, Math.min(3, this.highScores.size()));
	}


}