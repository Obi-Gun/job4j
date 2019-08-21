package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.format("Кот с кличкой %s съел %s \n", this.name, this.food);
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();
    }
}