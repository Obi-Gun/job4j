package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void ifMansHeightIs178ThenWeight89() {
        int in = 178;
        int expected = 89;
        int out = (int) Fit.manWeight(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void ifWomansHeightIs178ThenWeight78() {
        int in = 178;
        int expected = 78;
        int out = (int) Fit.womanWeight(in);
        Assert.assertEquals(expected, out);
    }
}
