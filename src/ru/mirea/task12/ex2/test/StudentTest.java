package ru.mirea.task12.ex2.test;

import ru.mirea.task12.ex2.entity.SortingStudentsByGPA;
import ru.mirea.task12.ex2.entity.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class StudentTest {
    ArrayList<Student> students;

    public StudentTest() {
        randomFillStudentList(10);
        printStudentList();
        System.out.println();
        sortArray();
        printStudentList();
    }

    public void sortArray() {
        SortingStudentsByGPA.quickSort(students, 0, students.size() - 1);
    }

    public void randomFillStudentList(int numberStudents) {
        Random random = new Random();
        students = new ArrayList<>();
        for (int i = 0; i < numberStudents; i++) {
            Student student = new Student(UUID.randomUUID().toString(), random.nextInt(100), random.nextInt(100));
            students.add(student);
        }
    }

    public void printStudentList() {
        for (Student i : students) {
            System.out.println(i);
        }
    }
}
