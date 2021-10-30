package ru.mirea.task14.ex5.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Queue;

public class Game extends JFrame {
    JLabel firstStart = new JLabel();
    JLabel secondStart = new JLabel();
    JLabel curAdd = new JLabel("0");
    JPanel p = new JPanel();
    JButton addFirst = new JButton("Первому");
    JButton addSecond = new JButton("Второму");
    JButton playButton = new JButton("Ок");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    Queue<Integer> firstPlayer = new ArrayDeque<>();
    Queue<Integer> secondPlayer = new ArrayDeque<>();

    public void distribution() {
        for (int i = 0; i < 5; i++) {
            firstPlayer.add(Integer.parseInt("" + firstStart.getText().charAt(i)));
        }
        for (int i = 0; i < 5; i++) {
            secondPlayer.add(Integer.parseInt("" + firstStart.getText().charAt(i)));
        }
    }

    public int getFirstNode(Queue<Integer> player) {
        return player.poll();
    }

    public void compare() {
        int firstPlayerNode = getFirstNode(firstPlayer);
        int secondPlayerNode = getFirstNode(secondPlayer);
        if (firstPlayerNode < secondPlayerNode || (firstPlayerNode == 9 && secondPlayerNode == 0)) {
            secondPlayer.add(firstPlayerNode);
            secondPlayer.add(secondPlayerNode);
        } else {
            firstPlayer.add(firstPlayerNode);
            firstPlayer.add(secondPlayerNode);
        }
    }

    public void play(int k) {
        if (firstPlayer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "second " + k);
            return;
        } else if (secondPlayer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "first " + k);
            return;
        } else if (k > 106) {
            JOptionPane.showMessageDialog(null, "botva");
            return;
        } else {
            compare();
            k++;
            play(k);
        }
    }

    Game() {
        setTitle("Игра");
        setSize(500, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.add(addFirst);
        p.add(addSecond);
        p1.add(new JLabel("Первый игрок:"));
        p1.add(firstStart);
        p2.add(new JLabel("Второй игрок:"));
        p2.add(secondStart);
        p3.add(new JLabel("Добавить номер: "));
        p3.add(curAdd);
        getContentPane().add(p1, BorderLayout.NORTH);
        getContentPane().add(p2, BorderLayout.SOUTH);
        getContentPane().add(p3, BorderLayout.CENTER);
        getContentPane().add(p, BorderLayout.EAST);
        getContentPane().add(playButton, BorderLayout.WEST);
        playButton.setEnabled(false);
        addFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstStart.setText(firstStart.getText() + curAdd.getText());
                curAdd.setText(Integer.toString(Integer.parseInt(curAdd.getText()) + 1));
                if (firstStart.getText().length() == 5) {
                    addFirst.setEnabled(false);
                    if (secondStart.getText().length() == 5) {
                        playButton.setEnabled(true);
                    }
                }
            }
        });
        addSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondStart.setText(secondStart.getText() + curAdd.getText());
                curAdd.setText(Integer.toString(Integer.parseInt(curAdd.getText()) + 1));
                if (secondStart.getText().length() == 5) {
                    addSecond.setEnabled(false);
                    if (firstStart.getText().length() == 5) {
                        playButton.setEnabled(true);
                    }
                }
            }
        });
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distribution();
                play(0);
                firstStart.setText("");
                secondStart.setText("");
                curAdd.setText("0");
                addFirst.setEnabled(true);
                addSecond.setEnabled(true);
                playButton.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}
