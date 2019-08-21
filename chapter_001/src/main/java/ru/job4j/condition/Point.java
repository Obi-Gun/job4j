package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    //to refactor
    public Point() {
    }

    //to refactor
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

//    public static void main(String[] args) {
//        double result = distance(0, 0, 2, 0);
//        System.out.println("distance from (0, 0) to (2, 0) is " + result);
//        result = distance(5, 0, 10, 0);
//        System.out.println("distance from (5, 0) to (10, 0) is " + result);
//        result = distance(0, 0, 2, 2);
//        System.out.println("distance from (0, 0) to (2, 2) is " + result);
//    }
}
