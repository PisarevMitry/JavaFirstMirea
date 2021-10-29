package ru.mirea.task13.ex3.test;


import java.util.Arrays;

class CustomArrayList {
    private int[] arr;

    public CustomArrayList() {
        arr = new int[1];
    }

    public CustomArrayList(int length) {
        arr = new int[length];
    }

    public void add(int number) {
        arr[arr.length - 1] = number;
        arr = Arrays.copyOf(arr, arr.length + 1);
    }

    public void remove(int index) {
        for (int a = index; a < arr.length - 1; a++) {
            arr[a] = arr[a + 1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        System.out.println(list.arr.length);
        list.add(5);
        System.out.println(list.arr.length);
        list.add(10);
        System.out.println(list.arr.length);
        list.remove(0);
        System.out.println(list.arr.length);
    }
}
