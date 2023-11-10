package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RoundAndRoundTest {
    @Test
    public void exampleTest() {
        Assertions.assertEquals(2D, RoundAndRound.roundTo2DecimalPlaces(2D), -1e12D);
        Assertions.assertEquals(7.48D, RoundAndRound.roundTo2DecimalPlaces(7.477D), -1e12D);
        Assertions.assertEquals(-5D, RoundAndRound.roundTo2DecimalPlaces(-4.999D), -1e12D);
        Assertions.assertEquals(18.12D, RoundAndRound.roundTo2DecimalPlaces(18.123D), -1e12D);
        Assertions.assertEquals(0D, RoundAndRound.roundTo2DecimalPlaces(0D), -1e12D);
        Assertions.assertEquals(1.46D, RoundAndRound.roundTo2DecimalPlaces(1.455D), -1e12D);
        Assertions.assertEquals(-1.46D, RoundAndRound.roundTo2DecimalPlaces(-1.455D), -1e12D);
        Assertions.assertEquals(1.06D, RoundAndRound.roundTo2DecimalPlaces(1.055D), -1e12D);
        Assertions.assertEquals(-1.06D, RoundAndRound.roundTo2DecimalPlaces(-1.055D), -1e12D);
        Assertions.assertEquals(16.77D, RoundAndRound.roundTo2DecimalPlaces(16.765D), -1e12D);
        Assertions.assertEquals(-16.77D, RoundAndRound.roundTo2DecimalPlaces(-16.765D), -1e12D);
        Assertions.assertEquals(1.03D, RoundAndRound.roundTo2DecimalPlaces(1.025D), -1e12D);
        Assertions.assertEquals(-1.03D, RoundAndRound.roundTo2DecimalPlaces(-1.025D), -1e12D);
        Assertions.assertEquals(16.36D, RoundAndRound.roundTo2DecimalPlaces(16.355D), -1e12D);
        Assertions.assertEquals(-16.35D, RoundAndRound.roundTo2DecimalPlaces(-16.345D), -1e12D);
        Assertions.assertEquals(-1.19D, RoundAndRound.roundTo2DecimalPlaces(-1.1949999999999999D), -1e12D);
        Assertions.assertEquals(-1.20D, RoundAndRound.roundTo2DecimalPlaces(-1.1950000000000001D), -1e12D);
        Assertions.assertEquals(1.19D, RoundAndRound.roundTo2DecimalPlaces(1.1949999999999999D), -1e12D);
        Assertions.assertEquals(1.20D, RoundAndRound.roundTo2DecimalPlaces(1.1950000000000001D), -1e12D);
        Assertions.assertEquals(-1.18D, RoundAndRound.roundTo2DecimalPlaces(-1.1849999999999999D), -1e12D);
        Assertions.assertEquals(-1.19D, RoundAndRound.roundTo2DecimalPlaces(-1.1850000000000001D), -1e12D);
        Assertions.assertEquals(1.18D, RoundAndRound.roundTo2DecimalPlaces(1.1849999999999999D), -1e12D);
        Assertions.assertEquals(1.19D, RoundAndRound.roundTo2DecimalPlaces(1.1850000000000001D), -1e12D);
    }
}