package ru.mirea.task6.ex1.test;


import ru.mirea.task6.ex1.entity.Dog;
import ru.mirea.task6.ex1.entity.Pig;

public class NameableTest {

    public static void main(String[] args) {

        Pig pig = new Pig("123");
        System.out.println(pig.getName());

        Dog dog = new Dog("2342");
        System.out.println(dog.getName());
    }
}
