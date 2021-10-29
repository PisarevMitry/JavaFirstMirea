package ru.mirea.task11.ex3.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JTextArea jTextArea = new JTextArea();
    JMenu jMenuColor;
    JMenu jMenuFont;
    JMenuBar jMenuBar = new JMenuBar();
    JMenuItem blue, yellow, red, bold, normal, italic;

    public Main() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setJMenuBar(jMenuBar);

        jMenuColor = new JMenu("color");
        jMenuFont = new JMenu("font");

        blue = jMenuColor.add("blue");
        yellow = jMenuColor.add("yellow");
        red = jMenuColor.add("red");

        bold = jMenuFont.add("bold");
        normal = jMenuFont.add("normal");
        italic = jMenuFont.add("italic");

        jMenuBar.add(jMenuColor);
        jMenuBar.add(jMenuFont);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        jTextArea.setPreferredSize(new Dimension(300, 70));

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.blue);
            }
        });
        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.yellow);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.red);
            }
        });

        bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font(Font.SERIF, Font.BOLD, 12));
            }
        });
        normal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font(Font.SERIF, Font.PLAIN, 12));
            }
        });
        italic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font(Font.SERIF, Font.ITALIC, 12));
            }
        });
        add(jTextArea);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}