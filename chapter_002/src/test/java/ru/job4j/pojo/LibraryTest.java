package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {

    @Test
    public void whenNameisThirdThen3() {
        Book[] books = new Book[4];
        books[0] = new Book("1", 1);
        books[1] = new Book("2", 2);
        books[2] = new Book("3", 3);
        books[3] = new Book("Name", 4);
        Book[] input = books;
        String search = "Name";
        int result = Library.indexOf(input, search);
        int expect = 3;
        assertThat(result, is(expect));
    }
}
