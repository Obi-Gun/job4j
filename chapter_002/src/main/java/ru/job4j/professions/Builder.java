package ru.job4j.professions;

public class Builder extends Engineer {
    private boolean isForeman; //прораб ли
    private int workersCount;

    @Override
    public void work() {
        this.wasteTime();
        super.work();
    }

    public void wasteTime() {
    }
}
