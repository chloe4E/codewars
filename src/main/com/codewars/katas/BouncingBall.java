package com.codewars.katas;

/**
 * [Bouncing Balls]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
 * <p>
 * Description:
 * A child is playing with a ball on the nth floor of a tall building. The height of this floor above ground level, h, is known.
 * <p>
 * He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).
 * <p>
 * His mother looks out of a window 1.5 meters from the ground.
 * <p>
 * How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing)?
 * <p>
 * Three conditions must be met for a valid experiment:
 * Float parameter "h" in meters must be greater than 0
 * Float parameter "bounce" must be greater than 0 and less than 1
 * Float parameter "window" must be less than h.
 * If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
 * <p>
 * Note:
 * The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.
 * <p>
 * Examples:
 * - h = 3, bounce = 0.66, window = 1.5, result is 3
 * <p>
 * - h = 3, bounce = 1, window = 1.5, result is -1
 * <p>
 * (Condition 2) not fulfilled).
 */
public class BouncingBall {

	public static int bouncingBall(double h, double bounce, double window) {
		// your code
		// validate inputs:
		System.out.printf("h: %s, bounce: %s, window: %s \n", String.valueOf(h), String.valueOf(bounce), String.valueOf(window));
		if (h < 0 || bounce >= 1 || bounce <= 0 || window >= h) {
			System.out.print("One condition is failing");
			return -1;
		}

		int viewBall = 1;
		while (h * bounce > window) {
			viewBall = viewBall + 2;
			h = h * bounce;
		}
		System.out.printf("View ball: %d", viewBall);
		return viewBall;
	}
}