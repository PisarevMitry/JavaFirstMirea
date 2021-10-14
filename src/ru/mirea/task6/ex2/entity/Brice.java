package ru.mirea.task6.ex2.entity;

public class Brice implements Priceable {

    public int price;

    public Brice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
