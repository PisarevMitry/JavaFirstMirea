package ru.mirea.task2;

import ru.mirea.task2.test.TestBook;
import ru.mirea.task2.test.TestDog;
import ru.mirea.task2.test.TestBall;

public class Main {

    public static void main(String[] args) {
        TestBook test1 = new TestBook();
        test1.test();
        TestBall test2 = new TestBall();
        test2.test();
        TestDog test3 = new TestDog();
        test3.test();
    }
}
