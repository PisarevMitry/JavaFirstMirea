package ru.mirea.task14.ex2.test;

import java.util.*;

public class Game {
    Queue<Integer> firstPlayer = new ArrayDeque<>();
    Queue<Integer> secondPlayer = new ArrayDeque<>();

    public Game() {
        distribution();
        play(0);
    }

    public void distribution() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            firstPlayer.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            secondPlayer.add(scanner.nextInt());
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
            System.out.println("second " + k);
            return;
        } else if (secondPlayer.isEmpty()) {
            System.out.println("first " + k);
            return;
        } else if (k > 106) {
            System.out.println("botva");
            return;
        } else {
            compare();
            k++;
            play(k);
        }
    }

    public static void main(String[] args) {
        Game main = new Game();
    }
}
