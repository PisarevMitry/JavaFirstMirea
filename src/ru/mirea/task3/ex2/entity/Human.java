package ru.mirea.task3.ex2.entity;

import java.util.Random;

public class Human {
    private Head head;
    private Leg leftLeg, rightLeg;
    private Hand leftHand, rightHand;
    private boolean availability;


    public Human() {
        this.head = new Head() {
        };
        this.leftLeg = new Leg() {
        };
        this.rightLeg = new Leg() {
        };
        this.leftHand = new Hand() {
        };
        this.rightHand = new Hand() {
        };
        this.availability = true;
    }

    public void doRandomInjury() {
        Random random = new Random();
        int num = random.nextInt(4);
        switch (num) {
            case (1):
                Код1;
                break;
            case (2):
                Код2;
                break;
            case (3):
                КодN;
                break;
            default:
                ;
                break;
        }
    }
}
