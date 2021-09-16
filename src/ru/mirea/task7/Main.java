package ru.mirea.task7;

import com.pisarevdmitrii.entity.Movable;
import com.pisarevdmitrii.entity.MovableCircle;
import com.pisarevdmitrii.entity.MovableRectangle;
import com.pisarevdmitrii.test.ShapeTest;

public class Main {

    public static void main(String[] args) {
        ShapeTest test1 = new ShapeTest();
        Movable s = new MovableCircle(5, 1, 1, 1, 1);
        s.moveUp();
        System.out.println(s.toString());
    }
}