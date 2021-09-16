package ru.mirea.task2.test;

import ru.mirea.task2.entity.Book;

public class TestBook {

    public void test() {
        Book b1 = new Book("x", "y", 2);
        Book b2 = new Book("q", "w", 3);
        Book b3 = new Book("r", "y", 56);
        System.out.println(b1);
    }
}
