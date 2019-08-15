package ru.job4j.condition;

public class MultiMax {

    public int max(int first, int second, int third) {
        return new Max().max(new Max().max(first, second), third);
    }
}
