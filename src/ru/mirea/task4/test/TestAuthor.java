package ru.mirea.task4.test;

import ru.mirea.task4.entity.Author;

public class TestAuthor {
    public static void test() {
        Author b1 = new Author("Дмитрий", "d.pisarev.03@mail.ru", 'm');
        System.out.println(b1);
        b1.setEmail("d.pisarev.03@gmail.com");
        System.out.println(b1);
    }
}