package ru.mirea.task5.ex1.entity;

public class Plate extends Dish {

    public int radius;

    public Plate(String material, String color) {
        super(material, color);
    }

    public Plate(String material, String color, int radius) {
        super(material, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
