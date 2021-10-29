package ru.mirea.task12.ex1.test;

import ru.mirea.task12.ex1.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(students);
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
