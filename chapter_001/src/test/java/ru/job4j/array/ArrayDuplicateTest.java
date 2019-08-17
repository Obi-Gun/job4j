package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"true", "true", "false", "true", "true", "true", "true", "true", };
        String[] result = arrayDuplicate.remove(input);
        String[] expect = {"true", "false"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"0", "1", "2", "0", "4", "7", "6", "7", "0"};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = {"0", "1", "2", "7", "4", "6"};
        assertThat(result, is(expect));
    }
}