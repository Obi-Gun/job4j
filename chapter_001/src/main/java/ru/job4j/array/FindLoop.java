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
     * @param startIndex start index for search
     * @param finishIndex finish index for search
     * @return index of an element or -1 if method doesn`t have find an element
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
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = startIndex; index < data.length && index <= finishIndex; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method indexOfMinValue looking for from start index to finish index
     * and return an element`s index with min value in array
     * @param data arr for search
     * @param startIndex start index for search
     * @param finishIndex finish index for search
     * @return index of an element with min value in array
     */
    public int indexOfMinValue(int[] data, int startIndex, int finishIndex) {
        if (startIndex > finishIndex) {
            int memory = startIndex;
            startIndex = finishIndex;
            finishIndex = memory;
        }
        int memoryIndex = startIndex >= 0 ? startIndex : 0;
        for (int i = memoryIndex + 1; i < data.length && i <= finishIndex; i++) {
            if (data[memoryIndex] > data[i]) {
                memoryIndex = i;
            }
        }
        return memoryIndex;
    }

    /**
     * Method sort sorts elements in array from min value to max value
     * @param data arr for search
     * @return array with sorted values from min value to max value
     */
    public int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int indexMinValue = indexOfMinValue(data, i, data.length);
            if (data[i - 1] > data[indexMinValue]) {
                int memory = data[i - 1];
                data[i - 1] = data[indexMinValue];
                data[indexMinValue] = memory;
            }
        }
        return data;
    }
}