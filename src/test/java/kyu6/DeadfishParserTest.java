package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadfishParserTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadfishParser.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadfishParser.parse("iiisdosodddddiso"));
    }
}