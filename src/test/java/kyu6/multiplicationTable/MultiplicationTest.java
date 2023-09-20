package kyu6.multiplicationTable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
    @Test
    @DisplayName("n = 3")
    void test3() {
        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        assertArrayEquals(test,Multiplication.multiplicationTable(3));
    }
    @Test
    @DisplayName("n = 1")
    void test1(){
        int[][] test1 = {{1}};
        assertArrayEquals(test1, Multiplication.multiplicationTable(1));
    }
}