package ru.mirea.task8.entity;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panel extends JPanel {
    private int figureCount;
    private double figureWidth;
    private double figureHeight;
    private List<Object> shapes = new ArrayList<>();
    private Random random = new Random();

    public Panel(int figureCount, double figureWidth, double figureHeight) {
        this.figureCount = figureCount;
        this.figureHeight = figureHeight;
        this.figureWidth = figureWidth;
    }

    public Panel(int figureCount) {
        this.figureCount = figureCount;
        this.figureHeight = random.nextInt(100);
        this.figureWidth = random.nextInt(100);
    }

    public void createComponent() {
        int dice;
        for (int a = 0; a < figureCount; a++) {
            dice = random.nextInt(2);
            if (dice == 1)
                addRectangle();
            else
                addEllipse();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object obj : shapes) {
            if (obj instanceof Rectangle) {
                ((Rectangle) obj).draw(g);
            } else if (obj instanceof Ellipse) {
                ((Ellipse) obj).draw(g);
            }
        }
    }

    private void addRectangle() {
        Color randomColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        shapes.add(new Rectangle(
                randomColor,
                random.nextInt(500),
                random.nextInt(500),
                figureWidth,
                figureHeight
        ));
    }

    private void addEllipse() {
        Color randomColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        shapes.add(new Ellipse(
                randomColor,
                random.nextInt(500),
                random.nextInt(500),
                figureWidth,
                figureHeight
        ));
    }
}