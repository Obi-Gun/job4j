package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

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

    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
}
