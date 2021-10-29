package ru.mirea.task13.ex1.test;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        Random rand = new Random();
        int temp;
        for (int a = 0; a < 10; a++) {
            temp = rand.nextInt(100);
            list.add(temp);
            System.out.println(temp);
        }
        System.out.println("------------------");
        for (int a = 0; a < 10; a++) {
            System.out.println(list.toArray()[a]);
        }
    }
}