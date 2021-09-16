package ru.mirea.task7;

import ru.mirea.task7.entity.Movable;
import ru.mirea.task7.entity.MovableCircle;
import ru.mirea.task7.test.ShapeTest;

public class Main {

    public static void main(String[] args) {
        ShapeTest test1 = new ShapeTest();
        Movable s = new MovableCircle(5, 1, 1, 1, 1);
        s.moveUp();
        System.out.println(s.toString());
    }
}