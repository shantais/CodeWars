package kyu8;

/**
 * This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */

public class SimpleMultiplication {
    public static void main(String[] args) {
        System.out.println("Checking for Odd numbers.");
        System.out.println("Should be 9 :" + simpleMultiplication(1));
        System.out.println("Should be 27 :" + simpleMultiplication(3));
        System.out.println("Should be 189 :" + simpleMultiplication(21));
        System.out.println("Should be 207 :" + simpleMultiplication(23));

        System.out.println("Checking for Even numbers.");
        System.out.println("Should be 16 :" + simpleMultiplication(2));
        System.out.println("Should be 32 :" + simpleMultiplication(4));
        System.out.println("Should be 176 :" + simpleMultiplication(22));
        System.out.println("Should be 208 :" + simpleMultiplication(26));
    }

    public static int simpleMultiplication(int n) {
        if (n%2==0) return n*8;
        else return n*9;
    }
}
