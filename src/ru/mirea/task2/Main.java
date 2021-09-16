package ru.mirea.task2;

import com.company.test.TestBall;
import com.company.test.TestBook;
import com.company.test.TestDog;

public class Main {

    public static void main(String[] args) {
        TestBook test1 =new TestBook();
        test1.test();
        TestBall test2 =new TestBall();
        test2.test();
        TestDog test3 =new TestDog();
        test3.test();
    }
}
