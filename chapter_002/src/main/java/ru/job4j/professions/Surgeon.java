package ru.job4j.professions;

public class Surgeon extends Doctor {
    private int scalpelCount;

    @Override
    public void heal(Client client) {
        super.heal(client);
        this.cutSomething(client);
    }

    private Client cutSomething(Client client) {
        return client;
    }
}
