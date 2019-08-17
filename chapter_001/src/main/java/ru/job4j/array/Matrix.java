package ru.job4j.array;

/**
 * Class for "Двухмерный массив. Таблица умножения. [#33491]" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class Matrix {

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 0; out < size; out++) {
            for (int inner = 0; inner < size; inner++) {
                table[out][inner] = (out + 1) * (inner + 1);
            }
        }
        return table;
    }
}