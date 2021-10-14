package ru.mirea.task8.ex2;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    static Image image;

    public Main() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        String url = args[0];
        System.out.println(url);
        image = Toolkit.getDefaultToolkit().getImage(url);
        new Main();
    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image, 200, 200, this);
    }
}