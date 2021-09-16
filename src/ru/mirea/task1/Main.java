package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        //Ex1
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        sum = 0;
        int k = 0;
        while (k < 10) {
            sum += array[k];
            k++;
        }
        System.out.println(sum);

        sum = 0;
        k = 0;
        do {
            sum += array[k];
            k++;
        } while (k != 10);
        System.out.println(sum);

        //Ex2

        System.out.println( args.length);
        for (String str : args) {
            System.out.println(str);
        }

        //Ex3
        for (int i = 1; i < 11; i++) {
            System.out.println((double) 1 / i);
        }

        //Ex4
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        sort(array);
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

        //Ex5
        int num = 10;
        Ex5(num);
    }

    private static void Ex5(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
