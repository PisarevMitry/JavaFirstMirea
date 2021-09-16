package ru.mirea.task3.entity;

public class Human implements MethodsOfKill{
    private Head head;
    private Leg leftLeg, rightLeg;
    private Hand leftHand, rightHand;
    private boolean availability;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public boolean isFracture() {
        return false;
    }

    @Override
    public void setFracture(boolean fracture) {

    }

    @Override
    public boolean isSprain() {
        return false;
    }

    @Override
    public void setSprain(boolean sprain) {

    }

    @Override
    public boolean isBurns() {
        return false;
    }

    @Override
    public void setBurns(boolean burns) {

    }


}
