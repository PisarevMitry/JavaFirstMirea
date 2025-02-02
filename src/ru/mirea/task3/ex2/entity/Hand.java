package ru.mirea.task3.ex2.entity;

public abstract class Hand {
    protected boolean availability;
    protected boolean fracture;
    protected boolean sprain;
    protected boolean burns;

    public Hand() {
        this.availability = true;
        this.fracture = false;
        this.sprain = false;
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
        return sprain;
    }

    public void setSprain(boolean sprain) {
        this.sprain = sprain;
    }

    public boolean isBurns() {
        return burns;
    }

    public void setBurns(boolean burns) {
        this.burns = burns;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "availability=" + availability +
                ", fracture=" + fracture +
                ", sprain=" + sprain +
                ", burns=" + burns +
                '}';
    }
}
