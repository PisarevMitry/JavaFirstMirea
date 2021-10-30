package ru.mirea.task12.ex2.entity;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public int compare(Student a, Student b) {
        if (a.getAverageScore() > b.getAverageScore())
            return 1;
        else if (a.getAverageScore() < b.getAverageScore())
            return -1;
        else
            return 0;
    }

}
