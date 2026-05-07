package com.codewars.katas;

/**
 * [Bouncing Balls]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
 *
 * <p>Description: A child drops a ball from height h. It bounces to a fraction of its height. How
 * many times does the mother see it pass her window?
 */
public class BouncingBall {

  /**
   * Returns how many times the ball passes the window, or -1 if inputs are invalid.
   */
  public static int bouncingBall(double h, double bounce, double window) {
    if (h < 0 || bounce >= 1 || bounce <= 0 || window >= h) {
      return -1;
    }

    int viewBall = 1;
    while (h * bounce > window) {
      viewBall = viewBall + 2;
      h = h * bounce;
    }
    return viewBall;
  }
}
