package ru.mirea.task8.ex3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    static Image image;
    protected static ArrayList<Image> frames = new ArrayList<>();

    public Main() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image, 200, 200, null);
    }

    public static void main(String[] args) {
        frames.add(new ImageIcon("src/ru/mirea/task8/ex3/image/bank_icon_194167.png").getImage());
        frames.add(new ImageIcon("src/ru/mirea/task8/ex3/image/coffee_break_icon_194169.png").getImage());
        frames.add(new ImageIcon("src/ru/mirea/task8/ex3/image/contract_icon_194172.png").getImage());
        frames.add(new ImageIcon("src/ru/mirea/task8/ex3/image/presentation_icon_194170.png").getImage());
        frames.add(new ImageIcon("src/ru/mirea/task8/ex3/image/success_icon_194168.png").getImage());

        Main frame = new Main();

        while (true) {
            for (int i = 0; i < 5; i++) {
                image = frames.get(i);
                frame.repaint();
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}