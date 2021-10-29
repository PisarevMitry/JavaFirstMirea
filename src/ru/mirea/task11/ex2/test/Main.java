package ru.mirea.task11.ex2.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main extends JFrame {
    JPanel CENTER = new JPanel();
    JPanel WEST = new JPanel();
    JPanel SOUTH = new JPanel();
    JPanel NORTH = new JPanel();
    JPanel EAST = new JPanel();
    Random random = new Random();

    public Main() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        CENTER.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        WEST.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        SOUTH.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        NORTH.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        EAST.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));

        add(NORTH, BorderLayout.NORTH);
        add(SOUTH, BorderLayout.SOUTH);
        add(EAST, BorderLayout.EAST);
        add(WEST, BorderLayout.WEST);
        add(CENTER, BorderLayout.CENTER);

        CENTER.add(new TextField("CENTER"));
        WEST.add(new TextField("WEST"));
        SOUTH.add(new TextField("SOUTH"));
        NORTH.add(new TextField("NORTH"));
        EAST.add(new TextField("EAST"));


        CENTER.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null, "Добро пожаловать в CENTER");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        WEST.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null, "Добро пожаловать в WEST");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        SOUTH.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null, "Добро пожаловать в SOUTH");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        NORTH.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null, "Добро пожаловать в NORTH");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        EAST.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showMessageDialog(null, "Добро пожаловать в EAST");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}