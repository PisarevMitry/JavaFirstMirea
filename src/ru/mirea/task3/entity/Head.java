package ru.mirea.task3.entity;

public class Head implements MethodsOfKill {
    private boolean availability;
    private boolean fracture;
    private boolean burns;

    public Head() {
        this.availability = true;
        this.fracture = false;
        this.burns = false;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isFracture() {
        return fracture;
    }

    public void setFracture(boolean fracture) {
        this.fracture = fracture;
    }

    public boolean isSprain() {
        return false;
    }

    public void setSprain(boolean sprain) {

    }

    public boolean isBurns() {
        return burns;
    }

    public void setBurns(boolean burns) {
        this.burns = burns;
    }
}
