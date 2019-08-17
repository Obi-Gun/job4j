package ru.job4j.array;

/**
 * Class for "Перевернуть массив. [#4441]" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class Turn {

    public int[] back(int[] array) {
        int memory;
        for (int i = 0; i < array.length / 2; i++) {
            memory = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = memory;
        }
        return array;
    }
}
