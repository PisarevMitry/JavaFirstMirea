package ru.mirea.task8.entity;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(Color color, int posX, int posY, double length, double width) {
        super(color, posX, posY);
        this.height = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Rectangle2D.Double rect = new Rectangle2D.Double(posX, posY, width, height);
        graphics2D.setColor(color);
        graphics2D.fill(rect);
    }
}