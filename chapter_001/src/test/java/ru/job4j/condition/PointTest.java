package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void ifFiveZeroToTenZeroThenDistanceIsFive() {
        int inX1 = 5;
        int inY1 = 0;
        int inX2 = 10;
        int inY2 = 0;
        int expected = 5;
        int out = (int) Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out);
    }
}
