package ru.job4j.array;

/**
 * Class for "Квадратный массив заполнен true или false по диагоналям. [#53859]" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
            if (data[data.length - 1][0] != data[data.length - 1 - i][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
