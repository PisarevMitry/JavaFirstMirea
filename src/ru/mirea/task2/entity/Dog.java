package ru.mirea.task2.entity;

public class Dog {
    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void intoHumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }

    @Override
    public String toString() {
        return "Dog name = '" + name +
                ", age = " + age;
    }
}
