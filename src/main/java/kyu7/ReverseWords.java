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
        if (string.matches("[^a-zA-Z0-9]\\s+")) {
            return string;
        } else {
            return Arrays.stream(string.split(" "))
                    .map(str -> new StringBuilder(str)
                            .reverse()
                            .toString())
                    .collect(Collectors.joining(" "));
        }
    }

    public static String reverseWords2(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }
}