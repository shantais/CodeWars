package kyu8;

import java.util.Arrays;

/**
 * Sum all the numbers of a given array ( cq. list ),
 * except the highest and the lowest element ( by value, not by index! ).
 *
 * The highest or lowest element respectively is a single element at each edge,
 * even if there are more than one with the same value.
 *
 * Mind the input validation.
 * Example
 *
 * { 6, 2, 1, 8, 10 } => 16
 * { 1, 1, 11, 2, 3 } => 6
 *
 * Input validation
 *
 * If an empty value ( null, None, Nothing etc. ) is given instead of an array,
 * or the given array is an empty list or a list with only 1 element, return 0.
 */

public class SumWithoutHighestLowestNumber {
    public static void main(String[] args) {
        System.out.println("Should be 16:" + sum(new int[]{6, 2, 1, 8, 10}));
    }
    public static int sum(int[] numbers)
    {
        if (numbers != null && Arrays.stream(numbers).findAny().isPresent()) {
            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();
            checkIfMatches(min, numbers);
            checkIfMatches(max, numbers);
            return Arrays.stream(numbers).sum();
        } else return 0;

    }

    private static void checkIfMatches(int maxMin, int[] numbers) {
        boolean isCleared = false;
        for (int i=0; i<numbers.length; i++){
            if (maxMin == numbers[i] && !isCleared) {
                numbers[i] = 0;
                isCleared = true;
            }
        }
    }
}
