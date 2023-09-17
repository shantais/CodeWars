package kyu8;

import java.util.Arrays;

/**
 * Write a function that takes an array of
 * numbers and returns the sum of the numbers.
 * The numbers can be negative or non-integer.
 * If the array does not contain any numbers
 * then you should return 0.
 *
 * Examples:
 *
 * Input: [1, 5.2, 4, 0, -1]
 * Output: 9.2
 *
 * Input: []
 * Output: 0
 *
 * Input: [-2.398]
 * Output: -2.398
 * Assumptions
 *
 * You can assume that you are only given numbers.
 * You cannot assume the size of the array.
 * You can assume that you do get an array
 * and if the array is empty, return 0.
 *
 * We're testing basic loops and math operations.
 * This is for beginners who are just learning loops
 * and math operations.
 * Advanced users may find this extremely
 * easy and can easily write this in one line.
 */

public class SumArrays {
    public static void main(String[] args) {
        System.out.println("Should be 0 :" + sum(new double[]{}));
        System.out.println("Should be -2.398 :" + sum(new double[]{-2.398}));
        System.out.println("Should be 6 :" + sum(new double[]{1, 2, 3}));
        System.out.println("Should be 6.6 :" + sum(new double[]{1.1, 2.2, 3.3}));
        System.out.println("Should be 9.2 :" + sum(new double[]{1, 5.2, 4, 0, -1}));
        System.out.println("Should be 320 :" + sum(new double[]{30, 89, 100, 101}));
    }
    public static double sum(double[] numbers) {
        return (numbers.length == 0 || numbers == null) ? 0 : Arrays.stream(numbers).sum();
    }
}
