package ru.job4j.calculator;

/**
 * Package for calculator task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 16.08.2019
 */
public class Calculator {

    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }

    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }

    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    /**
     * Method main
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4,2);
        multiply(2,1);
        subtrack(10,5);
    }
}
