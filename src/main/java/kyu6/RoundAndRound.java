package kyu6;

/**
 * Since there are lots of katas requiring you to round numbers to 2 decimal places,
 * you decided to extract the method to ease out the process.
 * And you can't even get this right!
 * Quick, fix the bug before everyone in CodeWars notices that you can't even round a number correctly!
 */

public class RoundAndRound {
    public static double roundTo2DecimalPlaces(double number) {
        return Math.round(number * 100.0/100.0);
    }
}
