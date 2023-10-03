package kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

/**
 * We need a function to collect these numbers, that may receive two integers aaa, bbb that defines the range [a,b][a, b][a,b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
 * Examples
 * Let's see some cases (input -> output):
 * 1, 10  --> [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 1, 100 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
 * If there are no numbers of this kind in the range
 * [a,b][a, b][a,b] the function should output an empty list.
 * 90, 100 --> []
 * Enjoy it!!
 */

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.range(a,b).filter(digit -> {
            int [] currentNumber = Arrays.stream(String.valueOf(digit).split("(?!^)"))
                    .mapToInt(Integer::parseInt).toArray();
            int sumOfPowers =0;
            for (int i=0; i<currentNumber.length; i++){
                sumOfPowers += (int) Math.pow(currentNumber[i],(i+1));
            }
            return sumOfPowers == digit;
        }).boxed().toList();
    }
}
