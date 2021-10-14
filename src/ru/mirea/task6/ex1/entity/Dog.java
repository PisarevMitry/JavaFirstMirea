package ru.mirea.task6.ex1.entity;

public class Dog implements Nameable {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
