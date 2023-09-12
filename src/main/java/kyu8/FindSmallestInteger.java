package kyu8;

/**
 * Given an array of integers your solution should find the smallest integer.
 *
 * For example:
 *
 *     Given [34, 15, 88, 2] your solution will return 2
 *     Given [34, -345, -1, 100] your solution will return -345
 *
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class FindSmallestInteger {
    public static void main(String[] args) {
        int [] tab1 = {34, 15, 88, 2};
        int [] tab2 = {34, -345, -1, 100};
        System.out.println(findSmallestInt(tab1));
        System.out.println(findSmallestInt(tab2));
    }
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int i=1; i<args.length;i++){
            if (smallest > args[i]) smallest = args[i];
        }
        return smallest;
    }

}
