package ru.job4j.pojo;

/**
 * Class for "Массивы и модели. [#174892]" task.
 * В этом классе шло освоение материала по моделям данных.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 01.09.2019
 */
public class Book {

    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
