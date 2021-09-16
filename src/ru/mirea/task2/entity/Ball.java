package ru.mirea.task2.entity;

public class Ball {
    public int weight;
    public int radius;
    public String material;

    public Ball(int weight, int radius, String material) {
        this.weight = weight;
        this.radius = radius;
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ball with " +
                "weight = " + weight +
                ", radius = " + radius +
                " from " + material + " material.";
    }
}
