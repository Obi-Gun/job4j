package ru.job4j.condition;

public class SqArea {
    public static int square(int perimeter, int koeff) {
        int height = perimeter / (2 * koeff + 2);
        return height * height * koeff;
    }

    public static void main(String[] args) {
        int result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        result1 = square(8, 1);
        System.out.println(" p = 8, k = 1, s = 4, real = " + result1);
        result1 = square(12, 1);
        System.out.println(" p = 12, k = 1, s = 9, real = " + result1);
        result1 = square(12, 2);
        System.out.println(" p = 12, k = 2, s = 8, real = " + result1);
    }
}
