package kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Complete the function that accepts a string parameter,
 * and reverses each word in the string. All spaces in the string should be retained.
 * Examples
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */

public class ReverseWords {
    public static String reverseWords(String string) {
        return reverseEach(string.split(" "));
    }

    private static String reverseEach(String [] strings){
        return Arrays.stream(strings).map(string -> new StringBuilder(string).reverse().toString()).collect(Collectors.joining(" "));
    }
}
