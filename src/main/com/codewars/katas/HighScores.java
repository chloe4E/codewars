package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * [High Scores]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/high-scores
 *
 * <p>Description: Manage a game player's High Score list. Return the highest score, latest score,
 * and top three scores.
 */
public class HighScores {

  private final List<Integer> highScores;

  /** Constructs a HighScores instance with the given list of scores. */
  public HighScores(List<Integer> highScores) {
    this.highScores = new ArrayList<>(highScores);
  }

  /** Returns all scores. */
  List<Integer> scores() {
    return this.highScores;
  }

  /** Returns the most recently added score. */
  Integer latest() {
    return this.highScores.getLast();
  }

  /** Returns the personal best score. */
  Integer personalBest() {
    return this.highScores.stream().mapToInt(e -> e).max().orElseThrow();
  }

  /** Returns the top three scores in descending order. */
  List<Integer> personalTopThree() {
    List<Integer> sortedHighScore = new ArrayList<>(this.highScores);
    sortedHighScore.sort((a, b) -> b - a);
    return sortedHighScore.subList(0, Math.min(3, this.highScores.size()));
  }
}
