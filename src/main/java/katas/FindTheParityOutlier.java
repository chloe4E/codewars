package katas;

/**
 * [Find The Parity Outlier]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
 *
 * Description:
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
 * Write a method that takes the array as an argument and returns this "outlier" N.
 */
import java.util.*;

// this solution times out:
public class FindOutlier {
    static int find(int[] integers) {

        HashSet<Integer> oddSet = new HashSet<Integer>();
        HashSet<Integer> evenSet = new HashSet<Integer>();

        for(int n:integers){
            if(n%2==0){
                evenSet.add(n);
            } else {
                oddSet.add(n);
            }
        }

        if(evenSet.size()==1){
            return evenSet.iterator().next();
        } else {
            return oddSet.iterator().next();
        }

    }
}

// also timing out
public class FindOutlier1 {
    static int find(int[] integers) {

        int countOdd = 0;
        int countEven = 0;

        HashSet<Integer> oddSet = new HashSet<Integer>();
        HashSet<Integer> evenSet = new HashSet<Integer>();

        while (countOdd == 0 || countEven == 0) {
            for ( int i: integers){
                if(i%2 == 0){
                    countEven = countEven+1;
                    evenSet.add(i);
                } else {
                    countOdd = countOdd+1;
                    oddSet.add(i);
                }
            }
        }

        if (countOdd == 1){
            return oddSet.iterator().next();
        } else {
            return evenSet.iterator().next();}

    }
}