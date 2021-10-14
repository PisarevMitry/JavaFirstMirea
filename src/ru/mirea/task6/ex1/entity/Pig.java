package ru.mirea.task6.ex1.entity;

public class Pig implements Nameable {
    public String name;

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
