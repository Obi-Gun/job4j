package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenArray12345678910Then10987654321() {
        Turn turn = new Turn();
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = turn.back(input);
        int[] expect = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenArray123456789Then987654321() {
        Turn turn = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = turn.back(input);
        int[] expect = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}
