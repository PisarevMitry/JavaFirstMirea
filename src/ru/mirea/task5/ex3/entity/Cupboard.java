package ru.mirea.task5.ex3.entity;

public class Cupboard extends Furniture {
    public int height;
    public boolean presenceMirror;

    public Cupboard(String material, int weight, int price) {
        super(material, weight, price);
    }

    public Cupboard(String material, int weight, int price, int height, boolean presenceMirror) {
        super(material, weight, price);
        this.height = height;
        this.presenceMirror = presenceMirror;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isPresenceMirror() {
        return presenceMirror;
    }

    public void setPresenceMirror(boolean presenceMirror) {
        this.presenceMirror = presenceMirror;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "height='" + height + '\'' +
                ", presenceMirror=" + presenceMirror +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
