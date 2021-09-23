package ru.mirea.task5.ex3.test;

import ru.mirea.task5.ex3.entity.Cupboard;
import ru.mirea.task5.ex3.entity.Furniture;
import ru.mirea.task5.ex3.entity.SoftFurniture;

public class FurnitureTest {

    public static void main(String[] args) {

        Furniture cupboard = new Cupboard("ткань, дсп", 20, 10999, 2000, true);
        System.out.println(cupboard);

        Furniture softFurniture = new SoftFurniture("ткань, дсп", 20, 20999, "Диван", "Декоративный");
        System.out.println(softFurniture);
    }
}
