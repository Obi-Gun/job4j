package ru.job4j.array;

import java.util.Arrays;

/**
 * Class for "Удаление дубликатов в массиве. [#225]" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class ArrayDuplicate {

    public String[] remove(String[] array) {
        int uniqEl = array.length;
        for (int out = 0; out < uniqEl - 1; out++) {
            for (int in = out + 1; in < uniqEl ; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[uniqEl - 1];
                    uniqEl--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, uniqEl);
    }
}
