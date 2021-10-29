package ru.mirea.task11.ex1.test;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main extends JFrame {
    JTextField jTextField = new JTextField();
    JButton button = new JButton();
    Random random = new Random();
    int number;
    int counter;
    int result;
    String text;

    public Main() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        jTextField.setPreferredSize(new Dimension(300, 70));
        button.setPreferredSize(new Dimension(200, 80));
        jTextField.setHorizontalAlignment(0);
        jTextField.setFont(new Font("TimesRoman", Font.BOLD, 30));
        button.setFont(new Font("TimesRoman", Font.BOLD, 30));
        button.setText("Guess");
        createNumber();
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                guess();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(jTextField);
        add(button);
    }

    private void createNumber() {
        counter = 3;
        number = random.nextInt(20);
    }

    private void guess() {
        text = jTextField.getText();
        try {
            result = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            jTextField.setText("");
            showMessageDialog(null, "Not an integer!");
            return;
        }
        if (result < number) {
            counter--;
            showMessageDialog(null, "Number is greater \n Tries left: " + counter);
        } else if (result > number) {
            counter--;
            showMessageDialog(null, "Number is less \n Tries left: " + counter);
        } else {
            showMessageDialog(null, "Congrats! You guessed right!");
            createNumber();
        }
        if (counter == 0) {
            showMessageDialog(null, "No tries left! You loose!");
            createNumber();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}