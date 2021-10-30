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
        int i, j;
        double newValue;
        Student newStudent;
        for (i = 0; i < students.size(); i++) {
            newValue = students.get(i).getAverageScore();
            newStudent = students.get(i);
            for (j = i - 1; j >= 0; j--) {
                if (newValue < students.get(j).getAverageScore()) {
                    students.set(j + 1, students.get(j));
                } else {
                    break;
                }
            }
            students.set(j + 1, newStudent);
        }
    }

    public void randomFillStudentList(int numberStudents) {
        Random random = new Random();
        this.students = new ArrayList<>();
        for (int i = 0; i < numberStudents; i++) {
            Student student = new Student(UUID.randomUUID().toString(), random.nextInt(100), random.nextInt(100));
            this.students.add(student);
        }
    }

    public void printStudentList() {
        for (Student i : this.students) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();
    }
}
