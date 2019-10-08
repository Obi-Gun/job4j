package ru.job4j.oop;

public class Student extends Object {

    public void sing(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void playTheBayan() {
        System.out.println("*bayan`s sounds*");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.playTheBayan();
            String song = "I believe I can fly";
            petya.sing(song);
        }
    }
}
