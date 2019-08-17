package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    /**
     * Tests for method public int indexOf(int[] data, int el)
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas9Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 9, 5};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayDoesntHave9ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    /**
     * Tests for method public int indexOf(int[] data, int el, int startIndex, int finishIndex)
     */
    @Test
    public void whenFindThen3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenDoesntFindThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 5;
        int start = 1;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindButStartIndexAndFinishIndexIsOutOfArrayLengthThen7() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4, 9, 8, 7, 6, 3};
        int value = 7;
        int start = -77777;
        int finish = 77777;
        int result = find.indexOf(input, value, start, finish);
        int expect = 7;
        assertThat(result, is(expect));
    }

    /**
     * Tests for method public int indexOfMinValue(int[] data, int startIndex, int finishIndex)
     */
    @Test
    public void whenMinValueIs5ThenIndexIs6() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {8, 9, 18, 7, 10, 8, 5, 18};
        int startIndex = 1;
        int finishIndex = 6;
        int result = find.indexOfMinValue(input, startIndex, finishIndex);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenMinValueIs5ButStartIndexAndFinishIndexIsOutOfArrayLengthIs6() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {8, 9, 18, 7, 10, 8, 5, 18};
        int startIndex = -77777;
        int finishIndex = 77777;
        int result = find.indexOfMinValue(input, startIndex, finishIndex);
        int expect = 6;
        assertThat(result, is(expect));
    }

    /**
     * Tests for method public int[] sort(int[] data)
     */
    @Test
    public void whenSort5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 4, 1, 2, 5, 3, 4, 1, 2, 5};
        int[] result = find.sort(input);
        int[] expect = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        assertThat(result, is(expect));
    }
}