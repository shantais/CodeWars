package kyu4;

import java.math.BigInteger;
import java.util.Arrays;

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
    public static String add(String a, String b){
        StringBuilder solution = new StringBuilder();
        StringBuilder numA = new StringBuilder(a);
        StringBuilder numB = new StringBuilder(b);
        int difference = Math.abs(a.length()-b.length());

        if (a.length()>b.length()){
            numB.insert(0, "0".repeat(difference));
        } else if (a.length()<b.length()){
            numA.insert(0, "0".repeat(difference));
        }

        String[] aArr = numA.reverse().toString().split("");
        String[] bArr = numB.reverse().toString().split("");
        int sum;
        String carry = "0";

        for (int i=0; i<aArr.length; i++){
            sum = Integer.parseInt(aArr[i])+Integer.parseInt(bArr[i])+Integer.parseInt(carry);
            System.out.println(sum);
            String[] tempSum = String.valueOf(sum).split("");

            if (tempSum.length==1){
                carry = "0";
                solution.append(tempSum[0]);
            } else {
                carry = tempSum[0];
                solution.append(tempSum[1]);
            }
        }
        if (!carry.equals("0")) {
            solution.append(Integer.parseInt(carry));
        }
        return solution.reverse().toString();
    }

    public static String addUsingBigInteger(String a, String b) {
        return (new BigInteger(a).add(new BigInteger(b))).toString();
    }
}
