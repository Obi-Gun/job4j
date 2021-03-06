package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hi");
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixThenTruePrefLongerThenWord() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Helloooo");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalsePrefLongerThenWord() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hiiiiiiii");
        assertThat(result, is(false));
    }
}