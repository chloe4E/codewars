package com.codewars.katas;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * [TripleDouble]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/55d5434f269c0c3f1b000058/train/java
 * <p>
 * Description:
 * [Brief description]
 */
public class TripleDouble {

		public static int TripleDouble(long num1, long num2) {
			//check triple in num1 and return array of digits having a triple
			ArrayList<Character> tripleArr = new ArrayList<>();
			String stringNum1 = Long.toString(num1);
			char[] charArray1 = stringNum1.toCharArray();

			for (int i=0; i <charArray1.length -2; i++){

				if(charArray1[i] == charArray1[i+1] &&  charArray1[i+1]== charArray1[i+2]){
					if (! tripleArr.contains(charArray1[i])){
						tripleArr.add(charArray1[i]);
					}
				}
			}

			String stringNum2 = Long.toString(num2);
			char[] charArray2 = stringNum2.toCharArray();


			for (int i=0; i <=charArray2.length -1; i++){
				System.out.println(charArray2[i]);
				if(charArray2[i] == charArray2[i+1]){
					System.out.println("found a double");
					if (tripleArr.contains(charArray2[i])){
						return 1;
					}
				}

			}
			return 0;

		}

	public static void main(String[] args) {
		assertEquals(TripleDouble.TripleDouble(111000, 100), 1);

	}
	}
