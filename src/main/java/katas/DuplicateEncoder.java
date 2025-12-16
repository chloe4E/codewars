package katas;

/**
 * [Duplicate Encoder]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/java
 *
 * Description:
 * The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
 */

 import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word){
    // create a HashMap with key letter and value ) or (
    HashMap<String, String> dic = new HashMap();
    String[] arrWord = word.toLowerCase().split("");
    System.out.println(String.valueOf(arrWord));
    for( String s: arrWord) {
         System.out.println(s);
      if(dic.containsKey(s)){
        dic.put(s,")");
      } else {
        dic.put(s,"(");
      }
    }

    // create the final string
    String result = "";
     for( String s: arrWord) {
       String letter = dic.get(s);
       result = result+letter;

  }
    return result;
}
  }
