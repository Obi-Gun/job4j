package ru.job4j.tracker;

public class Predoctor extends Animal {

    public Predoctor(String name) {
        super(name);
        System.out.println("class Predoctor(String name)");
    }

    public Predoctor(int example) {
        super(example);
        System.out.println("class Predoctor(int example)");
    }
}
