package ru.job4j.pojo;

/**
 * Class for "Массивы и модели. [#174892]" task.
 * В этом классе шло освоение материала по моделям данных.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 01.09.2019
 */
public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Java", 1000);
        books[1] = new Book("C++", 800);
        books[2] = new Book("C#", 1100);
        books[3] = new Book("Clean code", 300);
        String name = "Clean code";
        showBooks(books);
        replace(books, 3, 0);
        showBooks(books);
        showBooks(books, name);
    }

    /**
     * Method shows how many elements does it have and what are they looks like.
     * @param books
     */
    public static void showBooks(Book[] books) {
        System.out.format("massive has %d books\n", books.length);
        for (Book book: books) {
            System.out.format("Book named %s has %d pages\n", book.getName(), book.getPages());
        }
        System.out.println("\n");
    }

    /**
     * Method shows all elements with special name.
     * @param books massive.
     * @param name special name.
     */
    public static void showBooks(Book[] books, String name) {
        for (Book book: books) {
            if (book.getName().equals(name)) {
                System.out.format("Book named %s has %d pages\n", book.getName(), book.getPages());
            }
        }
        System.out.println("\n");
    }

    /**
     * Method replace first massive`s element to index of second element and
     * second massive`s element to index of first element.
     * @param books massive.
     * @param ind1 first element.
     * @param ind2 second element.
     */
    public static void replace(Book[] books, int ind1, int ind2) {
        Book memory = books[ind1];
        books[ind1] = books[ind2];
        books[ind2] = memory;
    }

    /**
     * Method indexOf looking for an element in array and return index of an element
     * @param data - arr for search
     * @param name - element for search
     * @return rst - index of an element or -1 if method doesn`t have find an element
     */
    public static int indexOf(Book[] data, String name) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index].getName().equals(name)) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
