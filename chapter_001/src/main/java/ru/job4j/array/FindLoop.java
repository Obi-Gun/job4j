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
     * @return rst - index of an element
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
     * @param startIndex start index for search
     * @param finishIndex finish index for search
     * @return index of an element
     */
    public int indexOf(int[] data, int el, int startIndex, int finishIndex) {
        if (startIndex > finishIndex) {
            int memory = startIndex;
            startIndex = finishIndex;
            finishIndex = memory;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (finishIndex >= data.length) {
            finishIndex = data.length - 1;
        }
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = startIndex; index < data.length && index <= finishIndex; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}