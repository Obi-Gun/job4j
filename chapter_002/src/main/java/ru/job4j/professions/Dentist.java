package ru.job4j.professions;

public class Dentist extends Doctor {
    private int drillsCount;

    @Override
    public void heal(Client client) {
        super.heal(client);
        this.drillSomething(client);
    }

    private void drillSomething(Client client) {
    }
}
