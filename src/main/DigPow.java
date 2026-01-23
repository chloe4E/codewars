/**
 * [Playing with digits]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
 * <p>
 * Description:
 * Some numbers have funny properties. For example:
 * <p>
 * 89 --> 8¹ + 9² = 89 * 1
 * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
 * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 * Given two positive integers n and p, we want to find a positive integer k, if it exists, such that the sum of the digits of n raised to consecutive powers starting from p is equal to k * n.
 * <p>
 * In other words, writing the consecutive digits of n as a, b, c, d ..., is there an integer k such that :
 * <p>
 * (
 * a
 * p
 * +
 * b
 * p
 * +
 * 1
 * +
 * c
 * p
 * +
 * 2
 * +
 * d
 * p
 * +
 * 3
 * +
 * .
 * .
 * .
 * )
 * =
 * n
 * ∗
 * k
 * (a
 * p
 * +b
 * p+1
 * +c
 * p+2
 * +d
 * p+3
 * +...)=n∗k
 * If it is the case we will return k, if not return -1.
 * <p>
 * Note: n and p will always be strictly positive integers.
 * <p>
 * Examples:
 * n = 89; p = 1 ---> 1 since 8¹ + 9² = 89 = 89 * 1
 * <p>
 * n = 92; p = 1 ---> -1 since there is no k such that 9¹ + 2² equals 92 * k
 * <p>
 * n = 695; p = 2 ---> 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
 */
public class DigPow {
	public static long digPow(int n, int p) {
		// your code
		long total = 0;

		int[] myArr = String.valueOf(n).chars().map(c -> c - '0').toArray();

		for (int i = 0; i < myArr.length; i++) {
			total = total + (long) Math.pow(myArr[i], p);
			p++;
		}

		System.out.println(total);

		if (total % n == 0) {
			return total / n;
		}
		return -1;
	}
}