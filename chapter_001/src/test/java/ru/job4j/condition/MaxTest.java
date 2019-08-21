package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMax123Then3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMax1234Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        int expected = 4;
        assertThat(result, is(expected));
    }
}
