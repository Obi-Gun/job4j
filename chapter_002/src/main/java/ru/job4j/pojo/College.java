package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student alexei = new Student();
        alexei.setName("Alexei");
        alexei.setSurname("Ivanov");
        alexei.setPatronymic("Ivanovich");
        alexei.setGroup(5);
        alexei.setAccession("01.01.2012");
        System.out.format("Here it is %s %s %s group number %d. He entered %s ", alexei.getSurname(),
                alexei.getName(), alexei.getPatronymic(), alexei.getGroup(), alexei.getAccession());
    }
}
