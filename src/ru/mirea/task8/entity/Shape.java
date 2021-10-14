package ru.mirea.task8.entity;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected int posX;
    protected int posY;

    public Shape(Color color, int posX, int posY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    abstract void draw(Graphics graphics);
}