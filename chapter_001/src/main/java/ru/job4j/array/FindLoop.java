package ru.job4j.array;

/**
 * Class for "Классический поиск перебором. [#33489]" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class FindLoop {

    /**
     * Method indexOf looking for an element in array and return index
     * @param data - arr for search
     * @param el - element for search
     * @return rst - index
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
}