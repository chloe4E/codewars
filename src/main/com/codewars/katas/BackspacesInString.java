package com.codewars.katas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * [BackspacesInString]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
 * <p>
 * Description:
 * [Brief description]
 */
public class BackspacesInString {

		public String cleanString(String s) {
			// your code here
			ArrayList<String> myArr = new ArrayList(Arrays.asList(s.split("")));

			if (! myArr.contains("#")){
				return myArr.toArray().toString();
			}

			for (int i=0; i < myArr.size(); i++) {
				if(myArr.get(i) == "#" && i > 0){
					// not allowed:
					//myArr.removeRange(i-1,i+1);
					myArr.subList(i-1,i+1).clear();
					i = i-2;
				}
			}
			return myArr.toArray().toString();



		}
	}
