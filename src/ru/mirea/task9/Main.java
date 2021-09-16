package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class BorderExample extends JFrame {

    int resultA = 0;
    int resultB = 0;
    String lastScorer = "N/A";
    String winnerStr = "DRAW";
    JPanel[] pnl = new JPanel[3];
    JButton jButtonA = new JButton("AC Milan");
    JButton jButtonB = new JButton("Real Madrid");
    JLabel jLabelRes = new JLabel(resultA + "X" + resultB);
    JLabel jLabelLastScore = new JLabel("Last Scorer: " + lastScorer);
    JLabel winner = new JLabel("Winner: " + winnerStr);

    public BorderExample() {

        setLayout(new GridLayout(1, 3));
        int r, b, g;
        for (int i = 0; i < 3; i++) {
            r = (int) (Math.random() * 255);
            b = (int) (Math.random() * 255);
            g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r, g, b));
            add(pnl[i]);
            pnl[i].setLayout(new FlowLayout());
        }

        pnl[0].add(jButtonA);
        pnl[1].add(jLabelRes);
        pnl[1].add(jLabelLastScore);
        pnl[1].add(winner);
        pnl[2].add(jButtonB);


        jButtonA.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resultA++;
                lastScorer = "AC Milan";
                if (resultA > resultB) {
                    winnerStr = "AC Milan";
                } else if (resultA == resultB) {
                    winnerStr = "DRAW";
                }
                jLabelRes.setText(resultA + "X" + resultB);
                jLabelLastScore.setText("Last Scorer: " + lastScorer);
                winner.setText("Winner: " + winnerStr);
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

        jButtonB.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resultB++;
                lastScorer = "Real Madrid";
                if (resultA < resultB) {
                    winnerStr = "Real Madrid";
                } else if (resultA == resultB) {
                    winnerStr = "DRAW";
                }
                jLabelRes.setText(resultA + "X" + resultB);
                jLabelLastScore.setText("Last Scorer: " + lastScorer);
                winner.setText("Winner: " + winnerStr);
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
        setSize(500, 200);
    }
}

public class Main {

    public static void main(String[] args) {
        new BorderExample().setVisible(true);
    }
}
