package kyu6.multiplicationTable;

/**
 * Your task, is to create N×N multiplication table, of size provided in parameter.
 *
 * For example, when given size is 3:
 *
 * 1 2 3
 * 2 4 6
 * 3 6 9
 *
 * For the given example, the return value should be:
 *
 * [[1,2,3],[2,4,6],[3,6,9]]
 */

public class Multiplication {
    public static int [][] multiplicationTable(int n){
        int [][] multiplication = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                multiplication[i][j] = (i+1)*(j+1);
            }
        }
        return multiplication;
    }
}
