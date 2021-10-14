package ru.mirea.task6.ex2.entity;

public class Car implements Priceable {

    public int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
