package katas;

/**
 * [Who likes it?]
 * Difficulty: [6 kyu]
 * URL:https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java
 *
 * Description:
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
 *
 * Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:
 */
class Solution {
    public static String whoLikesIt(String... names) {
        if (names.length == 0){
            return "no one likes this";
        } else if (names.length == 1){
            return String.valueOf(names[0])+" likes this";
        } else if (names.length == 2){
            return String.valueOf(names[0])+" and "+String.valueOf(names[1])+" like this";
        } else if (names.length == 3){
            return String.valueOf(names[0])+", "+String.valueOf(names[1])+ " and "+String.valueOf(names[2])+" like this";
        } else if (names.length > 3){
            return String.valueOf(names[0])+", "+String.valueOf(names[1])+ " and "+ String.valueOf(names.length-2)+" others like this";
        }
        return "";
    }
}

class Solution1 {
    public static String whoLikesIt(String... names) {
        int length = names.length;
        switch(length){
            case 0:
                return "no one likes this";
            case 1:
                return String.valueOf(names[0])+" likes this";
            case 2:
                return String.valueOf(names[0])+" and "+String.valueOf(names[1])+" like this";
            case 3:
                return String.valueOf(names[0])+", "+String.valueOf(names[1])+ " and "+String.valueOf(names[2])+" like this";
            default:
                return String.valueOf(names[0])+", "+String.valueOf(names[1])+ " and "+ String.valueOf(names.length-2)+" others like this";
        }
    }
}