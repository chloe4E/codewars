package com.codewars.katas;

import org.apache.commons.lang3.StringUtils;

/**
 * [Build Tower]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java
 *
 * <p>Description: Build a pyramid-shaped tower as an array of strings given a number of floors.
 */
public class TowerBuilder {

  /** Returns an array of strings representing the tower floors. */
  public static String[] towerBuilder(int numFloors) {
    int numberOfCharPerLevel = (numFloors * 2) - 1;

    String[] tower = new String[numFloors];

    int start = numberOfCharPerLevel / 2;
    int end = start + 1;

    for (int i = 0; i < numFloors; i++) {
      StringBuilder sb = new StringBuilder();
      sb.append(StringUtils.repeat(" ", numberOfCharPerLevel));
      sb.replace(start, end, StringUtils.repeat("*", end - start));
      start = start - 1;
      end = end + 1;

      tower[i] = sb.toString();
    }
    return tower;
  }
}
