package ru.mirea.task4.test;

import com.company.entity.Ball;

public class TestBall {
    public static void test() {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}