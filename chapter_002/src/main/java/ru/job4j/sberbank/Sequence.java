package ru.job4j.sberbank;

import java.util.Arrays;

/**
 * Class for working with sequences.
 * @author Alexandr Sakhatyr (Rostov-on-Don) (alexandr.010256@gmail.com)
 * @since 14.09.2019
 */
public class Sequence {
    private int start;
    private int end;
    private int length;

    /**
     * Method find increasing subsequences and compare them, then return the longest one.
     * @param arr
     * @return the longest subsequence.
     */
    public int[] findLongestIncreasingSubsequence(int[] arr) {
        Sequence tmp = new Sequence();
        if (arr.length != 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    tmp.setEnd(i + 2);
                    tmp.length++;
                    if (tmp.getLength() > this.getLength()) {
                        this.copy(tmp);
                    }
                } else {
                    tmp.setStart(i + 1);
                    tmp.setLength(0);
                }
            }
            arr = Arrays.copyOfRange(arr, this.getStart(), this.getEnd());
        }
        return arr;
    }

    /**
     * Method copies tmp`s fields to this`s fields.
     * @param tmp temporary data.
     */
    private void copy(Sequence tmp) {
            this.setStart(tmp.getStart());
            this.setEnd(tmp.getEnd());
            this.setLength(tmp.getLength());
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
