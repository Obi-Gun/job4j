package ru.job4j.sberbank;

import org.junit.Test;
import ru.job4j.sberbank.Sequence;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class for working with sequences.
 * @author Alexandr Sakhatyr (Rostov-on-Don) (alexandr.010256@gmail.com)
 * @since 14.09.2019
 */
public class SequenceTest {

    /**
     * Tests for method public int[] findLongestSubsequence(int[] arr).
     */
    @Test
    public void whenArrayIsEmptyThenTrue() {
        int[] input = {};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {};
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasOnlyOneElementThenTrue() {
        int[] input = {5};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenAllArrayIsTheLongestIncreasingSubsequenceThenTrue() {
        int[] input = {0, 1, 2, 4};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {0, 1, 2, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom1stTo4thThenTrue() {
        int[] input = {0, 0, 1, 2, 4};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {0, 1, 2, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom0To4ThenTrue() {
        int[] input = {0, 0, 0, 0, 0, 0, 1, 2, 4};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {0, 1, 2, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom0to3rdThenTrue() {
        int[] input = {0, 1, 2, 4, 4};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {0, 1, 2, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom0to3rdThenTrue2() {
        int[] input = {0, 1, 2, 4, 4, 4, 4, 4, 4};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {0, 1, 2, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom4thTo9thThenTrue() {
        int[] input = {0, 1, 2, 4, 4, 6, 9, 12, 13, 15};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {4, 6, 9, 12, 13, 15};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom4thTo9thThenTrue2() {
        int[] input = {0, 1, 2, 4, 4, 6, 9, 12, 13, 15, 4, 6, 9, 12, 13, 15};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {4, 6, 9, 12, 13, 15};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom5thTo9thThenTrue() {
        int[] input = {0, 1, 2, 4, 4, -15, -12, -10, -9, -8};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {-15, -12, -10, -9, -8};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTheLongestIncreasingSubsequenceFrom5thTo9thThenTrue2() {
        int[] input = {0, 1, 2, 4, 4, -15, -12, -10, -9, -8, -8};
        Sequence sequence = new Sequence();
        int[] result = sequence.findLongestIncreasingSubsequence(input);
        int[] expect = {-15, -12, -10, -9, -8};
        assertThat(result, is(expect));
    }
}
