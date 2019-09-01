package ru.job4j.pojo;

public class Student {

    private String name;
    private String surname;
    /**
     * Отчество
     */
    private String patronymic;
    private int group;
    /**
     * Дата поступления
     */
    private String accession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String  accession) {
        this.accession = accession;
    }
}
