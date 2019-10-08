package ru.job4j.tracker;

import java.util.Objects;
import java.util.Scanner;

/**
 * Class for "Реализация класса StartUI [#784]" task.
 * В этом классе шло освоение материала по созданию класса для управления программой с помощью команд из консоли.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 24.09.2019
 */
public class StartUI {

    /**
     * Menu's constant for add new Item.
     */
    private static final String ADD = "0";
    /**
     * Menu's constant for show all items.
     */
    private static final String SHOW = "1";
    /**
     * Menu's constant for edit item.
     */
    private static final String EDIT = "2";
    /**
     * Menu's constant for delete item.
     */
    private static final String DELETE = "3";
    /**
     * Menu's constant for find item by Id.
     */
    private static final String FIND_BY_ID = "4";
    /**
     * Menu's constant for find item by name.
     */
    private static final String FIND_BY_NAME = "5";
    /**
     * Menu's constant for exit Program.
     */
    private static final String EXIT = "6";

    private Scanner scanner = new Scanner(System.in);
    private Tracker tracker = new Tracker();

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = scanner.nextLine();
            if (answer.equals(ADD)) {
                this.createItem();
            } else if (answer.equals(SHOW)) {
                this.showItems();
            } else if (answer.equals(EDIT)) {
                this.edit();
            } else if (answer.equals(DELETE)) {
                this.delete();
            } else if (answer.equals(FIND_BY_ID)) {
                this.findById();
            } else if (answer.equals(FIND_BY_NAME)) {
                this.findByName();
            } else if (answer.equals(EXIT)) {
                System.out.println("Program was closed.");
                exit = true;
            } else {
                System.out.println("Invalid Input! Try again");
            }
        }
    }

    /**
     * Метод реализует добавление новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Adding new task... --------------");
        System.out.println("Add name for new task, please :");
        String name = scanner.nextLine();
        System.out.println("Add description for new task, please :");
        String desc = scanner.nextLine();
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ New task`s id : " + item.getId() + "-----------");
    }

    /**
     * Method shows us all items.
     */
    private void showItems() {
        Item[] list = tracker.findAll();
        for (int i = 0; i < list.length; i++) {
            System.out.println("Item " + i + " :");
            this.showItem(list[i]);
        }
    }

    /**
     * Method shows all items with special name.
     * @param items array of items with special name.
     */
    private void showItems(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Item " + i + " :");
            this.showItem(items[i]);
        }
    }

    /**
     * Method shows item`s id, name and description.
     * @param item which we should show.
     */
    private void showItem(Item item) {
        System.out.println("--------------------- id : " + item.getId() + "-----------");
        System.out.println("------------------- name : " + item.getName() + "-----------");
        System.out.println("------------ description : " + item.getDescription() + "-----------");
    }


    /**
     * Method asks id of method what we want to edit.
     * Then method shows it. Then it asks for edit fields and edit it.
     */
    private void edit() {
        System.out.println("Enter task`s id, please :");
        String id = scanner.nextLine();
        Item item = this.tracker.findById(id);
        if (Objects.isNull(item)) {
            System.out.println("Item with id [" + id + "] wasn't found.");
        } else {
            this.showItem(item);
            String name = this.editName(item);
            String description = this.editDescription(item);
            boolean ready = this.tracker.replace(id, new Item(name, description));
            if (ready) {
                System.out.println("Item was edited successful");
            } else {
                System.out.println("Editing wasn't successful. "
                        + "Please, write a report to IT support if you see this message");
            }
        }
    }

    /**
     * Method asks user to enter new name.
     * @param item which we should replace.
     * @return new name or old name.
     */
    private String editName(Item item) {
        System.out.println("If you would like edit field [name] then enter the name, "
                + "or skip (press enter) if you wouldn't like to edit the field");
        String name = scanner.nextLine();
        return this.copyIfNameEmpty(name, item);
    }
    /**
     * Method copies name from item if name is empty (It is empty if user didn't want to change it).
     * @param name user input.
     * @param item which we will copy if name is empty
     * @return name.
     */
    private String copyIfNameEmpty(String name, Item item) {
        if (name.length() == 0) {
            name = item.getName();
        }
        return name;
    }

    /**
     * Method asks user to enter new description.
     * @param item which we should replace.
     * @return new description or old description.
     */
    private String editDescription(Item item) {
        System.out.println("If you would like edit field [description] then enter the description, "
                + "or skip (press enter) if you wouldn't like to edit the field");
        String description = scanner.nextLine();
        return this.copyIfDescEmpty(description, item);
    }
    /**
     * Method copies desc from item if desc is empty (It is empty odf user didn't want to change it).
     * @param description user input.
     * @param item which we will copy if description is empty
     * @return description.
     */
    private String copyIfDescEmpty(String description, Item item) {
        if (description.length() == 0) {
            description = item.getDescription();
        }
        return description;
    }


    /**
     * Method deletes item from array.
     */
    private void delete() {
        System.out.println("------------ Deleting task... --------------\n"
                + "Enter task`s id, please :");
        boolean successful = this.tracker.delete(scanner.nextLine());
        if (successful) {
            System.out.println("Item was deleted");
        } else {
            System.out.println("Something goes wrong. Deleting wasn't successful. "
                    + "Please, write a report to IT support if you see this message");
        }
    }

    /**
     * Method finds item by id and shows it.
     */
    private void findById() {
        System.out.println("------------ Searching task... --------------\n"
                + "Enter task`s id, please :");
        String id = scanner.nextLine();
        Item item = this.tracker.findById(id);
        if (Objects.isNull(item)) {
            System.out.format("Task with  id : %s wasn't found.\n", id);
        } else {
            this.showItem(item);
        }
    }

    /**
     * Method finds item by name and shows it.
     */
    private void findByName() {
        System.out.println("------------ Searching task... --------------\n"
                + "Enter task`s name, please :");
        String name = scanner.nextLine();
        Item[] items = this.tracker.findByName(name);
        if (Objects.isNull(items)) {
            System.out.format("Tasks with name : %s weren't found.\n", name);
        } else {
            this.showItems(items);
        }
    }

    /**
     * Method shows menu "what action you can do".
     */
    private void showMenu() {
        System.out.println("------------------------------------------------\n"
                + "Choose action and enter it`s number, please\n"
                + "0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program");
    }

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        StartUI startUI = new StartUI();
        startUI.init();
    }
}
