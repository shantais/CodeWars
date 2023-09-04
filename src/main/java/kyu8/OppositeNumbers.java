package kyu8;

/**
 * Very simple, given an integer or a floating-point number, find its opposite.
 *
 * Examples:
 * 1: -1
 * 14: -14
 * -34: 34
 */

public class OppositeNumbers {
    public static void main(String[] args) {
        System.out.println(opposite(1));
        System.out.println(opposite(14));
        System.out.println(opposite(-34));
    }

    public static int opposite(int number)
    {
        return number*(-1);
    }
}
