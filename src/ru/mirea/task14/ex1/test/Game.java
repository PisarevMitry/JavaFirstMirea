package ru.mirea.task14.ex1.test;

import java.util.Scanner;
import java.util.Stack;

public class Game {
    Stack<Integer> firstPlayer = new Stack<>();
    Stack<Integer> secondPlayer = new Stack<>();

    public Game() {
        distribution();
        play(0);
    }

    public void distribution() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            firstPlayer.push(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            secondPlayer.push(scanner.nextInt());
        }
    }

    public int getFirstNode(Stack<Integer> player) {
        int firstNode = player.firstElement();
        player.removeElementAt(0);
        return firstNode;
    }

    public void compare() {
        int firstPlayerNode = getFirstNode(firstPlayer);
        int secondPlayerNode = getFirstNode(secondPlayer);
        if (firstPlayerNode < secondPlayerNode || (firstPlayerNode == 9 && secondPlayerNode == 0)) {
            secondPlayer.push(firstPlayerNode);
            secondPlayer.push(secondPlayerNode);
        } else {
            firstPlayer.push(firstPlayerNode);
            firstPlayer.push(secondPlayerNode);
        }
    }

    public void play(int k) {
        if (firstPlayer.empty()) {
            System.out.println("second " + k);
            return;
        } else if (secondPlayer.empty()) {
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
