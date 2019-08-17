package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenArrayTrueTrueTrueTrueFalseThenFalse() {
        Check check = new Check();
        boolean[] input = {true, true, true, true, false};
        boolean result = check.mono(input);
        boolean expect = false;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayFalse6timesThenTrue() {
        Check check = new Check();
        boolean[] input = {false, false, false, false, false, false};
        boolean result = check.mono(input);
        boolean expect = true;
        assertThat(result, is(expect));
    }
}
