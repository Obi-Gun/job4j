package ru.job4j.tracker;

import java.util.Objects;

/**
 * Class for "Реализовать класс Tracker [#396]" task.
 * В этом классе шло освоение материала по созданию класса обёртки над массивом заявок item.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 01.09.2019
 */
public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}