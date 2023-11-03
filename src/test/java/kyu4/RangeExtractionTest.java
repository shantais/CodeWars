package kyu4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeExtractionTest {
    @Test
    public void firstSequenceTest() {
        assertEquals("1-6", RangeExtraction.rangeExtraction(new int[] {1,2,3,4,5,6}));
    }

    @Test
    public void twoSequencesTest() {
        assertEquals("-6--1,1-6", RangeExtraction.rangeExtraction(new int[] {-6,-5,-4,-3,-2,-1,1,2,3,4,5,6}));
    }

    @Test
    public void sequenceAndSingleNumberTest1() {
        assertEquals("1-6,10", RangeExtraction.rangeExtraction(new int[] {1,2,3,4,5,6,10}));
    }

    @Test
    public void sequenceAndTwoNumbersTest() {
        assertEquals("-10,1-6,10", RangeExtraction.rangeExtraction(new int[] {-10,1,2,3,4,5,6,10}));
    }

    @Test
    public void sequenceAndTwoSequentialNumbersTest1() {
        assertEquals("-3,-2,1-6", RangeExtraction.rangeExtraction(new int[] {-3,-2,1,2,3,4,5,6}));
    }

    @Test
    public void sequenceAndTwoSequentialNumbersTest2() {
        assertEquals("1-6,10,11", RangeExtraction.rangeExtraction(new int[] {1,2,3,4,5,6,10,11}));
    }

    @Test
    public void test_BasicTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
        assertEquals("-3--1,2,10,15,16,18-20", RangeExtraction.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
    }
}