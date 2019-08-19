package ru.job4j.array;

/**
 * Class for "Классический поиск перебором. [#33489]" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class FindLoop {

    /**
     * Method indexOf looking for an element in array and return index of an element
     * @param data - arr for search
     * @param el - element for search
     * @return rst - index of an element or -1 if method doesn`t have find an element
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method indexOf looking for an element in array
     * from start index to finish index and return index of an element
     * @param data arr for search
     * @param el element for search
     * @param start start index for search
     * @param finish finish index for search
     * @return index of an element or -1 if method doesn`t have find an element
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        if (start > finish) {
            int memory = start;
            start = finish;
            finish = memory;
        }
        if (start < 0) {
            start = 0;
        }
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = start; i < data.length && i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * Method indexOfMinValue looking for from start index to finish index
     * and return an element`s index with min value in array
     * @param data arr for search
     * @param start start index for search
     * @param finish finish index for search
     * @return index of an element with min value in array
     */
    public int indexOfMinValue(int[] data, int start, int finish) {
        if (start > finish) {
            int tmp = start;
            start = finish;
            finish = tmp;
        }
        int memory = start >= 0 ? start : 0;
        for (int i = memory + 1; i < data.length && i <= finish; i++) {
            if (data[memory] > data[i]) {
                memory = i;
            }
        }
        return memory;
    }

    /**
     * Method sort sorts elements in array from min value to max value
     * @param data arr for search
     * @return array with sorted values from min value to max value
     */
    public int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int index = indexOfMinValue(data, i, data.length);
            if (data[i - 1] > data[index]) {
                int memory = data[i - 1];
                data[i - 1] = data[index];
                data[index] = memory;
            }
        }
        return data;
    }
}