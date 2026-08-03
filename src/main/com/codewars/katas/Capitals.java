package com.codewars.katas;
import java.util.List;
import java.util.ArrayList;
/**
 * [Kata Name] Difficulty: [7 kyu] URL: https://www.codewars.com/kata/539ee3b6757843632d00026b/java
 *
 * <p>Description: [Brief description]
 */
@SuppressWarnings("AbbreviationAsWordInName")
public class Capitals {

  /** Your solution here. */


    public static int[] capitals(String s){
      List<Integer> myRes = new ArrayList<>();
      // create a loop
      for (int i = 0; i < s.toCharArray().length ; i++){
        // check ascii for the letter
        int ascii = s.toCharArray()[i];
        // if ascii between 65 and 90 then return index
        if (ascii >= 65 && ascii <= 90){
          myRes.add(i);
        }

      }
      return myRes.stream().mapToInt(Integer::intValue).toArray();
    }
  }
}
