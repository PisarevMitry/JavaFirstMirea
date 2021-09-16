package ru.mirea.task4;

import ru.mirea.task4.test.TestAuthor;
import ru.mirea.task4.test.TestBall;

public class Main {

    public static void main(String[] args) {
        TestBall test1 = new TestBall();
        test1.test();
        TestAuthor test2 = new TestAuthor();
        test2.test();
    }
}
