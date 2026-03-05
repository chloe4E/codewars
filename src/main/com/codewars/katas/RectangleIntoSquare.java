package com.codewars.katas;

/**
 * [Rectangle Into Square]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/55466989aeecab5aac00003e/train/java
 * <p>
 * Description:
 * [Brief description]
 */

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquare {

	public static List<Integer> sqInRect(int lng, int wdth) {
		// your code
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
