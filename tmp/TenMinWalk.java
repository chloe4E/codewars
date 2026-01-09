package katas;

/**
 * [Take a Ten Minutes Walk]
 * Difficulty: [6 kyu]
 * URL: https://www.codewars.com/kata/...
 *
 * Description:
 * You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
 */
import java.util.HashMap;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        // check length (10)
        if(walk.length != 10){
            return false;
        }

        // create a map of direction
        HashMap<String, Integer> directionMap = new HashMap();
        for (char c:walk){
            Integer current = directionMap.getOrDefault(String.valueOf(c),0);
            directionMap.put(String.valueOf(c), current+1);
        }

        // check return to starting point (number of s = n and e = w)
        if ((directionMap.getOrDefault("n",0) == directionMap.getOrDefault("s",0)) &&
                (directionMap.getOrDefault("e",0) == directionMap.getOrDefault("w",0))){
            return true;
        }
        return false;
    }
}


/**
 solution 2

 **/

import java.util.HashMap;
import java.util.Map;

public class TenMinWalk2 {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        // check length (10)
        if(walk.length != 10){
            return false;
        }

        // create a map of direction
        Map<String, Integer> directionMap = new HashMap();

        for (char c:walk){
            directionMap.computeIfAbsent(String.valueOf(c), (k) -> 1);
            directionMap.computeIfPresent(String.valueOf(c), (k, v) -> v + 1);

        }

        // check return to starting point (number of s = n and e = w)
        if ((directionMap.getOrDefault("n",0) == directionMap.getOrDefault("s",0)) &&
                (directionMap.getOrDefault("e",0) == directionMap.getOrDefault("w",0))){
            return true;
        }
        return false;
    }
}