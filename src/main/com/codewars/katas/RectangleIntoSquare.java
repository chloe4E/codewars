package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * [Rectangle Into Square]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/55466989aeecab5aac00003e/train/java
 *
 * <p>Description: Given a rectangle with dimensions lng x wdth, find the sizes of the squares
 * produced when recursively cutting the largest possible square. Return null if lng == wdth.
 */
public class RectangleIntoSquare {

  /** Returns a list of square sizes produced when cutting the rectangle, or null if already square.
   */
  public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    }

    List<Integer> list = new ArrayList<>();

    while (lng != wdth) {
      int tempLng = Math.max(lng, wdth);
      int tempWdth = Math.min(lng, wdth);
      lng = tempLng;
      wdth = tempWdth;
      list.add(wdth);
      int oldwdth = wdth;
      wdth = lng - wdth;
      lng = oldwdth;
    }

    list.add(wdth);
    return list;
  }
}
