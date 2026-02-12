package com.codewars.katas;

/**
 * [Leap]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/leap
 * <p>
 * Instructions:
 * Introduction
 * A leap year (in the Gregorian calendar) occurs:
 *
 * In every year that is evenly divisible by 4.
 * Unless the year is evenly divisible by 100, in which case it's only a leap year if the year is also evenly divisible by 400.
 * Some examples:
 *
 * 1997 was not a leap year as it's not divisible by 4.
 * 1900 was not a leap year as it's not divisible by 400.
 * 2000 was a leap year!
 * Note
 * For a delightful, four-minute explanation of the whole phenomenon of leap years, check out this YouTube video.
 *
 * Instructions
 * Your task is to determine whether a given year is a leap year.
 *
 * Before you start, make sure you understand how to write code that can pass the test cases. For more context, check out this tutorial.
 *
 * Most Java exercises include multiple test cases. These cases are structured to support a useful process known as test-driven development (TDD). TDD involves repeating a structured cycle that helps programmers build complex functionality piece by piece rather than all at once. That cycle can be described as follows:
 *
 * Add a test that describes one piece of desired functionality your code is currently missing.
 * Run the tests to verify that this newly-added test fails.
 * Update your existing code until:
 * All the old tests continue to pass;
 * The new test also passes.
 * Clean up your code, making sure that all tests continue to pass. This typically involves renaming variables, removing duplicated chunks of logic, removing leftover logging, etc.
 * Return to step 1 until all desired functionality has been built!
 */

public class Leap {
	boolean isLeapYear(int year) {
//		In every year that is evenly divisible by 4.
//				* Unless the year is evenly divisible by 100, in which case it's only a leap year if the year is also evenly divisible by 400.

		if(year%100 ==0 && year%400 ==0){
			return true;
		} else return year % 4 == 0;
	}
}