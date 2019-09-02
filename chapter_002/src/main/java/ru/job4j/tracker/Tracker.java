package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Class for "Реализовать класс Tracker [#396]" task.
 * В этом классе шло освоение материала по созданию класса обёртки над массивом заявок item.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 01.09.2019
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Method adds new item to array.
     * @param item element we want to add.
     * @return added item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Method заменяет объект в ячейке с id массива items на объект item.
     * @param id will be delete from items.
     * @param item will be add to array items.
     * @return true if all right or false if smth goes wrong.
     */
    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = this.findIndexById(id);
        if (Objects.isNull(item.getId())) {
            item.setId(this.generateId());
        }
        if (index != -1) {
            this.items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    /**
     * Method deletes element (item with special id) in array this.items.
     * Метод должен вернуть boolean результат - удалось ли провести операцию.
     * @param id element which we want delete.
     * @return true if operation was successful otherwise false.
     */
    public boolean delete(String id) {
        boolean rsl = false;
        int index = this.findIndexById(id);
        if (index != -1 && index < this.items.length - 1) {
            System.arraycopy(this.items, index + 1, this.items, index, this.position - index - 1);
            rsl = true;
            this.items[position-- - 1] = null;
        }
        return rsl;
    }

    /**
     * Method returns new array which contains only items we`ve added before.
     * @return array without null items.
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Method search items with key name and add them to new array.
     * @param key is a searching name.
     * @return new array with key names.
     */
    public Item[] findByName(String key) {
        int counter = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getName().equals(key)) {
                counter++;
            }
        }
        Item[] result = new Item[counter];
        int elem = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getName().equals(key)) {
                result[elem++] = items[i];
            }
        }
        return result;
    }

    /**
     * Method looking for element with special id.
     * @param id searching element.
     * @return searching element.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Method looking for element with special id.
     * @param id searching element.
     * @return id of searching element.
     */
    private int findIndexById(String id) {
        int rsl = -1;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(System.currentTimeMillis() + rm.nextLong());
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getPosition() {
        return position;
    }

    private  void setPosition(int position) {
        this.position = position;
    }
}