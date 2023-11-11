package kyu6;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu6.RoundAndRound.roundTo2DecimalPlaces;

class RoundAndRoundTest {
    @Test
    public void exampleTest() {
        Assertions.assertEquals(2D, roundTo2DecimalPlaces(2D), -1e12D);
        Assertions.assertEquals(7.48D, roundTo2DecimalPlaces(7.477D), -1e12D);
        Assert.assertEquals(-5D, roundTo2DecimalPlaces(-4.999D), -1e12D);
        Assert.assertEquals(18.12D, roundTo2DecimalPlaces(18.123D), -1e12D);
        Assert.assertEquals(0D, roundTo2DecimalPlaces(0D), -1e12D);
        Assert.assertEquals(1.46D, roundTo2DecimalPlaces(1.455D), -1e12D);
        Assert.assertEquals(-1.46D, roundTo2DecimalPlaces(-1.455D), -1e12D);
        Assert.assertEquals(1.06D, roundTo2DecimalPlaces(1.055D), -1e12D);
        Assert.assertEquals(-1.06D, roundTo2DecimalPlaces(-1.055D), -1e12D);
        Assert.assertEquals(16.77D, roundTo2DecimalPlaces(16.765D), -1e12D);
        Assert.assertEquals(-16.77D, roundTo2DecimalPlaces(-16.765D), -1e12D);
        Assert.assertEquals(1.03D, roundTo2DecimalPlaces(1.025D), -1e12D);
        Assert.assertEquals(-1.03D, roundTo2DecimalPlaces(-1.025D), -1e12D);
        Assert.assertEquals(16.36D, roundTo2DecimalPlaces(16.355D), -1e12D);
        Assert.assertEquals(-16.35D, roundTo2DecimalPlaces(-16.345D), -1e12D);
        Assert.assertEquals(-1.19D, roundTo2DecimalPlaces(-1.1949999999999999D), -1e12D);
        Assert.assertEquals(-1.20D, roundTo2DecimalPlaces(-1.1950000000000001D), -1e12D);
        Assert.assertEquals(1.19D, roundTo2DecimalPlaces(1.1949999999999999D), -1e12D);
        Assert.assertEquals(1.20D, roundTo2DecimalPlaces(1.1950000000000001D), -1e12D);
        Assert.assertEquals(-1.18D, roundTo2DecimalPlaces(-1.1849999999999999D), -1e12D);
        Assert.assertEquals(-1.19D, roundTo2DecimalPlaces(-1.1850000000000001D), -1e12D);
        Assert.assertEquals(1.18D, roundTo2DecimalPlaces(1.1849999999999999D), -1e12D);
        Assert.assertEquals(1.19D, roundTo2DecimalPlaces(1.1850000000000001D), -1e12D);
    }
}