package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int inStart = 1;
        int inFinish = 10;
        int expected = 30;
        int out = new Counter().add(inStart, inFinish);
        Assert.assertEquals(expected, out);
    }
}
