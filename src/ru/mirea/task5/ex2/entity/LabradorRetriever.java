package ru.mirea.task5.ex2.entity;

public class LabradorRetriever extends Dog {

    public LabradorRetriever() {
    }

    public LabradorRetriever(String nickname, int age, int weight) {
        super(nickname, age, weight);
    }

    @Override
    public String toString() {
        return "LabradorRetriever{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
