package ru.mirea.task5.ex2.test;

import ru.mirea.task5.ex2.entity.Dog;
import ru.mirea.task5.ex2.entity.LabradorRetriever;
import ru.mirea.task5.ex2.entity.Pomeranian;

public class DogTest {

    public static void main(String[] args) {

        Dog pomeranian = new Pomeranian("dog1", 2, 10);
        System.out.println(pomeranian);

        Dog labrador = new LabradorRetriever("dog2", 2, 10);
        System.out.println(labrador);
    }
}
