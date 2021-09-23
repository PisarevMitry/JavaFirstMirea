package ru.mirea.task5.ex2.entity;

public abstract class Dog {
    public String nickname;
    public int age;
    public int weight;

    public Dog() {
    }

    public Dog(String nickname, int age, int weight) {
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
