package ru.job4j.oop;

import org.junit.Test;

import java.lang.invoke.VarHandle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BatteryTest {

    @Test
    public void when10and5then0() {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        first.exchange(second);
        int expect = 0;
        int result = first.status();
        assertThat(result, is(expect));
    }

    @Test
    public void when10and5then15() {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        first.exchange(second);
        int expect = 15;
        int result = second.status();
        assertThat(result, is(expect));
    }
}
