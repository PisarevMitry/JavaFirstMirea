package ru.mirea.task12.ex2.entity;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public static void quickSort(ArrayList<Student> array, int low, int high) {
        if (array.size() == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int support = array.get(middle).getAverageScore();
        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).getAverageScore() > support) {
                i++;
            }
            while (array.get(i).getAverageScore() < support) {
                j--;
            }
            if (i <= j) {
                Student temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public int compare(Student a, Student b) {
        if (a.getAverageScore() > b.getAverageScore())
            return 1;
        else if (a.getAverageScore() < b.getAverageScore())
            return -1;
        else
            return 0;
    }

}
