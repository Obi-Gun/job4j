package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Class for calculating distance between two points
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 23.08.2019
 */
public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Method for calculating distance between two points in 2D space
     * @param that - Point with x and y coordinates
     * @return distance value
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Method for calculating distance between two points in 3D space
     * @param that - Point with x, y and z coordinates
     * @return distance value
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.format("Point[%s, %s]\n", this.x, this.y);
    }

    public void info3d() {
        System.out.format("Point[%s, %s, %s]\n", this.x, this.y, this.z);
    }
}
