package ru.job4j.condition;

public class MultiMax {

    public int max(int first, int second, int third) {
        Max max = new Max();
        return max.max(max.max(first, second), third);
    }
}
