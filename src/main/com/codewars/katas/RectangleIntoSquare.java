package com.codewars.katas;

/**
 * [Rectangle Into Square]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/55466989aeecab5aac00003e/train/java
 * <p>
 * Description:
 * [Brief description]
 */

import java.util.List;
import java.util.ArrayList;

public class RectangleIntoSquare {

	public static List<Integer> sqInRect(int lng, int wdth) {
		// your code

		if(lng == wdth){
			return null;
		}

		List<Integer> list = new ArrayList<>();
		int remainingArea = lng * wdth;


		while (lng != 2*wdth) {
			list.add(wdth);
			remainingArea = remainingArea - (wdth*wdth);
			int oldwdth = wdth;
			wdth = lng -wdth;
			lng = oldwdth;
		}

		list.add(wdth);
		list.add(wdth);
		return list;

	}
}
