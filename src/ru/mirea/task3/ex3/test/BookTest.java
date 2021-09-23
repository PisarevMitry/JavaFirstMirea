package ru.mirea.task3.ex3.test;

import ru.mirea.task3.ex3.entity.Author;
import ru.mirea.task3.ex3.entity.Book;

public class BookTest {

    public static void main(String[] args) {

        Author author = new Author("Антон", "Чехов");
        Book book1 = new Book(author, "Толстый и тонкий", 1883);
        System.out.println(book1);
    }
}



