package ru.job4j.oop;

public class Student {

    public void sing() {
        System.out.println("I believe I can fly");
    }

    public void playTheBayan() {
        System.out.println("*bayan`s sounds*");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.playTheBayan();
            petya.sing();
        }
    }
}
