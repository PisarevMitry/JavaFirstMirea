package ru.mirea.task6.ex2.test;


import ru.mirea.task6.ex2.entity.Brice;
import ru.mirea.task6.ex2.entity.Car;
import ru.mirea.task6.ex2.entity.Priceable;

public class PriceableTest {

    public static void main(String[] args) {

        Priceable car = new Car(1000000);
        System.out.println(car.getPrice());

        Priceable brice = new Brice(23042);
        System.out.println(brice.getPrice());
    }
}
