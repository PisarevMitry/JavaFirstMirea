package ru.mirea.task3.ex2.entity;

public abstract class Head {
    protected boolean availability;
    protected boolean fracture;
    protected boolean burns;

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

    public boolean isBurns() {
        return burns;
    }

    public void setBurns(boolean burns) {
        this.burns = burns;
    }

    @Override
    public String toString() {
        return "Head{" +
                "availability=" + availability +
                ", fracture=" + fracture +
                ", burns=" + burns +
                '}';
    }
}
