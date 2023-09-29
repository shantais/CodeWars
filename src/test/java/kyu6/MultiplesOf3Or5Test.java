package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3Or5Test {
    @Test
    public void test1() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }
    @Test
    public void test2() {
        assertEquals(60, new MultiplesOf3Or5().solution(16));
    }

}