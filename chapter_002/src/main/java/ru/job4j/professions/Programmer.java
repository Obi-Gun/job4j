package ru.job4j.professions;

public class Programmer extends Engineer {
    private String language;
    private String frameworks;
    private String englishLvl;
    private boolean isSociable;

    @Override
    public void work() {
        super.work();
        this.speakWithClient();
        Programm programm = new Programm();
        this.writeSmth(programm);
    }

    public void writeSmth(Programm programm) {
    }

}
