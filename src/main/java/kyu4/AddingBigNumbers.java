package kyu4;

import java.math.BigInteger;

/**
 * We need to sum big numbers, and we require your help.
 * Write a function that returns the sum of two numbers.
 * The input numbers are strings and the function must return a string.
 * Example
 * add("123", "321"); -> "444"
 * add("11", "99");   -> "110"
 * Notes
 *     The input numbers are big.
 *     The input is a string of only digits
 *     The numbers are positives
 */

public class AddingBigNumbers {
    public static String add(String a, String b) {
        return (new BigInteger(a).add(new BigInteger(b))).toString();
    }
}