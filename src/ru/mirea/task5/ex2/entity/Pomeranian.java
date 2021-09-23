package ru.mirea.task5.ex2.entity;

public class Pomeranian extends Dog {

    public Pomeranian() {
    }

    public Pomeranian(String nickname, int age, int weight) {
        super(nickname, age, weight);
    }

    @Override
    public String toString() {
        return "Pomeranian{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
