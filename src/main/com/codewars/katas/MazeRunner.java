package com.codewars.katas;

/**
 * [Maze Runner]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/58663693b359c4a6560001d6/train/java
 * <p>
 * Description:
 * [Brief description]
 */

public class MazeRunner {
	public static String walk(int[][] maze, String[] directions) {
		// here be dragons
		// starts at 2 - find 2 coordinates
		int currentI = 0;
		int currentJ = 0;
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.println(maze[i][j]);
				if (maze[i][j] == 2) {
					System.out.println("setting currentI and currentJ");
					currentI = i;
					currentJ = j;
					break;
				}
			}
		}

		// for each direction ahve a switch case determining new place
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
			}
			if(currentJ < 0 || currentI < 0 || currentI >= maze.length || currentJ >= maze[0].length) {
				return "Dead";
			}

			// check if new place is 0 or 1 or 3
			if (maze[currentI][currentJ] == 3) {
				System.out.println("shall print");
				return "Finish";
			} else if (maze[currentI][currentJ] == 1) {
				return "Dead";
			}

		}
		return "Lost";
	}
}
