package kyu8;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 *
 * Note: input will never be an empty string
 */

public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println(fakeBin("509321967506747"));
        System.out.println(fakeBin("366058562030849490134388085"));
    }
    public static String fakeBin(String numberString) {
        String newNumberString = "";
        for (char num : numberString.toCharArray()){
            if (Character.getNumericValue(num) >= 5) {
                newNumberString += "1";
            }
            else newNumberString += "0";
        }
        return newNumberString;
    }
}
