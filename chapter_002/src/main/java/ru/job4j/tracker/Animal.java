package ru.job4j.tracker;

public class Animal {
    String name;
    protected int example;

    public Animal(String name) {
        this.name = name;
        System.out.println("class Animal(String name)");
    }

    public Animal(int example) {
        this.example = example;
        System.out.println("class Animal(int example)");
    }

    public static void main(String[] args) {
        Tiger tigerString = new Tiger("Lol");
        Tiger tigerInt = new Tiger(1);
        System.out.println(tigerString.name);
        System.out.println(tigerInt.example);
    }
}
