package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BreakCamelCaseTest {
    @Test
    public void doesSplitBasicCamelcase() {
        assertEquals( "camel Casing", BreakCamelCase.camelCaseBreak("camelCasing"));
    }
    @Test
    public void doesSplitBasicCamelcase2() {
        assertEquals( "camel Casing Test", BreakCamelCase.camelCaseBreak("camelCasingTest"));
    }
    @Test
    public void doesSplitNoCamelcase() {
        assertEquals( "camelcasingtest", BreakCamelCase.camelCaseBreak("camelcasingtest"));
    }
}