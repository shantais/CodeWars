package kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */

public class BreakCamelCase {
    public static String camelCaseBreak(String camelCaseString) {
        return Arrays.stream(camelCaseString.split("(?!^)"))
                .map(ch -> ch.matches("[A-Z]") ? " "+ch : ch)
                .collect(Collectors.joining());
    }
}
