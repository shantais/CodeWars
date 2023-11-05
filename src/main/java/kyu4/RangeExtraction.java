package kyu4;

import java.util.HashSet;
import java.util.Set;

/**
 * A format for expressing an ordered list of integers is to use a comma separated list of either
 *     individual integers
 *     or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'.
 *     The range includes all integers in the interval including both endpoints.
 *     It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
 * Complete the solution so that it takes a list of integers in increasing order
 * and returns a correctly formatted string in the range format.
 * Example:
 * Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
 * # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
 */

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        StringBuilder extractedRanges = new StringBuilder();
        Set<Integer> subArr = new HashSet<>();
        for (int i=0; i<arr.length-1; i++){
            subArr.add(arr[i]);
            if (arr[i] == arr[i + 1] - 1){
                subArr.add(arr[i+1]);
            } else {
                appendSequence(extractedRanges, subArr);
                extractedRanges.append(",");
                subArr.clear();
                subArr.add(arr[i+1]);
            }
            System.out.println(subArr);
        }
        appendSequence(extractedRanges, subArr);
        return extractedRanges.toString();
    }

    public static void appendSequence(StringBuilder extractedRanges, Set<Integer> subArr){
        if (subArr.size() > 2){
            extractedRanges.append(subArr.stream().min(Integer::compare).get()).append("-").append(subArr.stream().max(Integer::compare).get());
        } else if (subArr.size() > 1){
            extractedRanges.append(subArr.stream().min(Integer::compare).get()).append(",").append(subArr.stream().max(Integer::compare).get());
        } else {
            extractedRanges.append(subArr.stream().min(Integer::compare).get());
        }
    }
}
