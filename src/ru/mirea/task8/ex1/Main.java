package ru.mirea.task8.ex1;

import ru.mirea.task8.entity.Panel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Panel panel = new Panel(10);
        panel.createComponent();
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}