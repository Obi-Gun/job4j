package ru.job4j.array;

/**
 * Class for "Заполнить массив степенями чисел" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class Square {

    /**
     * Method calculate
     * Заполняет массив через цикл элементами от 1 до bound возведенными в квадрат
     * @param bound
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int conter = 1;
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(conter++, 2);
//            conter++;
        }
        return rst;
    }
}
