package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {

    @Test
    public void if1234then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int expected = 4;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void if1254then5() {
        int first = 1;
        int second = 2;
        int third = 5;
        int forth = 4;
        int expected = 5;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void if1634then6() {
        int first = 1;
        int second = 6;
        int third = 3;
        int forth = 4;
        int expected = 6;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void if7234then7() {
        int first = 7;
        int second = 2;
        int third = 3;
        int forth = 4;
        int expected = 7;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out);
    }
}
