package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenStartWithPrefixThenTrueEqualsWordsLength() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "Hello");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalseEqualsWordsLength() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "Rello");
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithShortPrefixThenTrue() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "lo");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithShortPrefixThenFalse() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "la");
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithLongRightPrefixThenFalse() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "HHHHello");
        assertThat(result, is(false));
    }

    @Test
    public void whenNotStartWithLongFalsePrefixThenFalse() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "HHHNello");
        assertThat(result, is(false));
    }
}