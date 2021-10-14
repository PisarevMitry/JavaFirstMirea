package ru.mirea.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ex3(a, b);
        System.out.println();
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(ex4(k, d, 1, 0));
        System.out.println();
        int n = scanner.nextInt();
        System.out.println(ex5(n));
        System.out.println();
        n = scanner.nextInt();
        System.out.println(ex6(n));
    }

    private static void ex3(int A, int B) {
        if (A < B) {
            System.out.print(A + " ");
            A++;
            ex3(A, B);
        } else if (A > B) {
            System.out.print(B + " ");
            B++;
            ex3(A, B);
        } else {
            return;
        }

    }

    private static int ex4(int k, int d, int i, int c) {
        if (k < i) {
            if (d == c) {
                return 1;
            } else {
                return 0;
            }
        }
        int x = 0;
        if (k != i) {
            x += ex4(k, d, i + 1, c);
        }
        for (int j = 1; j <= 9; j++) {
            x += ex4(k, d, i + 1, c + j);
        }
        return x;
    }

    private static int ex5(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + ex5(n / 10);
        }
    }

    private static String ex6(int n) {
        if (n < 2) {
            return "NO";
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return "NO";
                }
            }
            return "YES";
        }
    }
}