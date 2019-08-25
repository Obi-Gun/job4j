package ru.job4j.tracker;

public class Tiger extends Predoctor {

    public Tiger(String name) {
        super(name);
        System.out.println("class Tiger(String name)");
    }

    public Tiger(int example) {
        super(example);
        System.out.println("class Tiger(int example)");
    }

//    public static void main(String[] args) {
//        Tiger tiger = new Tiger("Lol");
//    }
}
