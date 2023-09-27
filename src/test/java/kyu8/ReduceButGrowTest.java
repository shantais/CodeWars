package kyu8;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReduceButGrowTest {

    @Test
    public void testGrow() {
        assertEquals(6, ReduceButGrow.grow(new int[]{1,2,3}));
        assertEquals(16, ReduceButGrow.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, ReduceButGrow.grow(new int[]{2,2,2,2,2,2}));
    }

    @Test
    public void testGrowStream() {
        assertEquals(6, ReduceButGrow.growStream(new int[]{1,2,3}));
        assertEquals(16, ReduceButGrow.growStream(new int[]{4,1,1,1,4}));
        assertEquals(64, ReduceButGrow.growStream(new int[]{2,2,2,2,2,2}));
    }
}