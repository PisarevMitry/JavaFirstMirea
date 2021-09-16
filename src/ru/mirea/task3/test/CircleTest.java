package ru.mirea.task3.test;

import ru.mirea.task3.entity.Circle;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(1,2);
        Circle circle2 = new Circle(1,2);
        Circle circle3 = new Circle(1,2);
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
        System.out.println(circle3.getRadius());
    }
}
