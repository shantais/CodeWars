package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3Or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }

}