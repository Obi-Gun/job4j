package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int monthly, int percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + (amount * percent / 100) - monthly * 12;
            year++;
        }
        return year;
    }
}
