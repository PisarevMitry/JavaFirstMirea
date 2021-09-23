package ru.mirea.task3.ex1.entity;

public class Circle {
    private double radius;
    private double square;

    public Circle() {
    }

    public Circle(double radius, double square) {
        this.radius = radius;
        this.square = square;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
