package com.codewars.katas;

/**
 * [Kata Name]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/...
 * <p>
 * Description:
 * [Brief description]
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