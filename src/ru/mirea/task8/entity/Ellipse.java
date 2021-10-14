package ru.mirea.task8.entity;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Shape {
    private double height;
    private double width;

    public Ellipse(Color color, int posX, int posY, double height, double width) {
        super(color, posX, posY);
        this.height = height;
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
        Ellipse2D.Double ellipse = new Ellipse2D.Double(posX, posY, width, height);
        graphics2D.setColor(color);
        graphics2D.fill(ellipse);
    }
}