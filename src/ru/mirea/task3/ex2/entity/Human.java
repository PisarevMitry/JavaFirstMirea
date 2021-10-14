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

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void doRandomInjury() {
        Random random = new Random();
        int num = random.nextInt(4);
        switch (num) {
            case (1):
                head.setAvailability(false);
                break;
            case (2):
                leftHand.setAvailability(false);
                ;
                break;
            case (3):
                rightHand.setAvailability(false);
                ;
                break;
            default:
                break;
        }
        if (head.isAvailability() == false || leftHand.isAvailability() == false || rightHand.isAvailability() == false) {
            setAvailability(false);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", availability=" + availability +
                '}';
    }
}
