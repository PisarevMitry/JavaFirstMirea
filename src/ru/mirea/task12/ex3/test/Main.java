package ru.mirea.task12.ex3.test;

import ru.mirea.task12.ex1.entity.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Main {
    ArrayList<Student> students1;
    ArrayList<Student> students2;

    public Main() {
        randomFillStudentList(10);
        printStudentList();
        System.out.println();
        sortArray(students1, students2, 0, 20);
        printStudentList();
    }

    public ArrayList<Student> sortArray(ArrayList<Student> buf1, ArrayList<Student> buf2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buf1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        ArrayList<Student> sorted1 = sortArray(buf1, buf2, startIndex, middle);
        ArrayList<Student> sorted2 = sortArray(buf1, buf2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        ArrayList<Student> result;
        if (sorted1 == buf1) {
            result = buf2;
        } else {
            result = buf1;
        }
        while (index1 < middle && index2 < endIndex) {
            if (sorted1.get(index1).getAverageScore() >= sorted2.get(index2).getAverageScore()) {
                result.set(destIndex++, sorted2.get(index2++));
            } else {
                result.set(destIndex++, sorted1.get(index1++));
            }
        }
        while (index1 < middle) {
            result.set(destIndex++, sorted1.get(index1++));
        }
        while (index2 < endIndex) {
            result.set(destIndex++, sorted2.get(index2++));
        }
        return result;
    }

    public void randomFillStudentList(int numberStudents) {
        Random random = new Random();
        students1 = new ArrayList<>();
        for (int i = 0; i < numberStudents; i++) {
            Student student = new Student(UUID.randomUUID().toString(), random.nextInt(100), random.nextInt(100));
            students1.add(student);
        }
        students2 = new ArrayList<>();
        for (int i = 0; i < numberStudents; i++) {
            Student student = new Student(UUID.randomUUID().toString(), random.nextInt(100), random.nextInt(100));
            students2.add(student);
        }
    }

    public void printStudentList() {
        for (Student i : students1) {
            System.out.println(i);
        }
        System.out.println();
        for (Student i : students2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
