package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        int man = (int) manWeight(178);
        System.out.println("Man 178 is " + man);
        int woman = (int) womanWeight(178);
        System.out.println("Woman 178 is " + woman);
    }
}
