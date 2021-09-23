package ru.mirea.task5.ex3.entity;

public abstract class Furniture {
    public String material;
    public int weight;
    public int price;

    public Furniture(String material, int weight, int price) {
        this.material = material;
        this.weight = weight;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
