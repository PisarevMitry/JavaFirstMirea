package ru.mirea.task12.ex1.entity;

public class Student implements Comparable<Student> {
    private String name;
    private int group;
    private int averageScore;

    @Override
    public int compareTo(Student otherSt) {
        return otherSt.averageScore - this.averageScore;
    }

    public Student(String name, int group, int averageScore) {
        this.name = name;
        this.group = group;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", averageScore=" + averageScore +
                '}';
    }
}
