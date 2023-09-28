package kyu8;

import java.util.Arrays;

/**
 * Given a set of numbers, return the additive inverse of each.
 * Each positive becomes negatives, and the negatives become positives.
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */

public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(number -> number*(-1))
                .toArray();
    }
}
