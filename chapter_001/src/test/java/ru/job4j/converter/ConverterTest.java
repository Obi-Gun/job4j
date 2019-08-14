package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = (int) converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = (int) converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {
        int in = 3;
        int expected = 210;
        int out = (int) converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 3;
        int expected = 180;
        int out = (int) converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}