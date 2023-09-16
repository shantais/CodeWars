package kyu8;

/**
 * Write a function which converts the input string to uppercase.
 */

public class MakeStringUpperCase {
    public static void main(String[] args) {
        System.out.println(MakeUpperCase("lower case text"));
    }
    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
}
