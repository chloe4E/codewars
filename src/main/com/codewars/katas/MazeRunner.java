package com.codewars.katas;

/**
 * [Maze Runner]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/58663693b359c4a6560001d6/train/java
 *
 * <p>Description: Navigate a maze following a list of directions. Returns "Finish", "Dead", or
 * "Lost".
 */
public class MazeRunner {

  /** Walks through the maze following directions and returns the outcome. */
  public static String walk(int[][] maze, String[] directions) {
    int currentI = 0;
    int currentJ = 0;
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze[0].length; j++) {
        if (maze[i][j] == 2) {
          currentI = i;
          currentJ = j;
          break;
        }
      }
    }

    for (String direction : directions) {
      switch (direction) {
        case "N":
          currentI = currentI - 1;
          break;
        case "S":
          currentI = currentI + 1;
          break;
        case "E":
          currentJ = currentJ + 1;
          break;
        case "W":
          currentJ = currentJ - 1;
          break;
        default:
          break;
      }
      if (currentJ < 0
          || currentI < 0
          || currentI >= maze.length
          || currentJ >= maze[0].length) {
        return "Dead";
      }

      if (maze[currentI][currentJ] == 3) {
        return "Finish";
      } else if (maze[currentI][currentJ] == 1) {
        return "Dead";
      }
    }
    return "Lost";
  }
}
