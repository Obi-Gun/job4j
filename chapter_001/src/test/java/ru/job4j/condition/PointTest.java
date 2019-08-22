package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {

    /**
     * Testing method double distance(Point that)
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.format("Result is %s\n", result);
        assertThat(result, is(10D));
    }

    @Test
    public void whenCheckItselfDistanceMethod() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    /**
     *  Testing method double distance3d(Point that)
     */
    @Test
    public void whenZeroAndTenThenTenDistance3dMethod() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 10, 0);
        double result = first.distance3d(second);
        first.info3d();
        second.info3d();
        System.out.format("Result is %s\n", result);
        assertThat(result, is(10D));
    }

    @Test
    public void whenCheckItselfDistance3dMethod() {
        Point point = new Point(0, 0, 0);
        double result = point.distance3d(point);
        assertThat(result, is(0D));
    }

    /**
     * Testing method void info()
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }

    /**
     * Testing method void info3d()
     */
    @Test
    public void whenShowInfo3d() {
        Point first = new Point(1, 1, 1);
        first.info3d();
        Point second = new Point(2, 2, 2);
        second.info3d();
    }
}
