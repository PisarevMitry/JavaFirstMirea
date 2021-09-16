package ru.mirea.task2.test;

import ru.mirea.task2.entity.Ball;

public class TestBall {

    public void test() {
        Ball b1 = new Ball(1, 2, "y");
        Ball b2 = new Ball(1, 7, "w");
        Ball b3 = new Ball(2, 4, "y");
        System.out.println(b1);
    }
}
