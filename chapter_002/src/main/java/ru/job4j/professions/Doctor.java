package ru.job4j.professions;

public class Doctor extends Profession {
    private boolean endResidency;

    public void heal(Client  client) {
        this.wellnessCheck(client);
        this.collectInstruments();
    }

    private void collectInstruments() {
    }

    private void wellnessCheck(Client client) {
        String diagnose = "smth";
        client.setDiagnose(diagnose);
    }
}
