/**
 * [Build a pile of Cubes]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/java
 * <p>
 * Description:
 * Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of
 * n
 * 3
 * n
 * 3
 * , the cube above will have volume of
 * (
 * n
 * −
 * 1
 * )
 * 3
 * (n−1)
 * 3
 * and so on until the top which will have a volume of
 * 1
 * 3
 * 1
 * 3
 * .
 * <p>
 * You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?
 * <p>
 * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to return the integer n such as
 * n
 * 3
 * +
 * (
 * n
 * −
 * 1
 * )
 * 3
 * +
 * (
 * n
 * −
 * 2
 * )
 * 3
 * +
 * .
 * .
 * .
 * +
 * 1
 * 3
 * =
 * m
 * n
 * 3
 * +(n−1)
 * 3
 * +(n−2)
 * 3
 * +...+1
 * 3
 * =m if such a n exists or -1 if there is no such n.
 * <p>
 * Examples:
 * findNb(1071225) --> 45
 * <p>
 * findNb(91716553919377) --> -1
 */
public class FindN {

	public static long findNb(long m) {
		// your code
		long n = 0;
		long vol = 0;

		while (vol <= m) {
			vol = vol + (long) Math.pow(n, 3);
			if (vol == m) {
				return n;
			}
			n++;
		}

		return -1;
	}

}