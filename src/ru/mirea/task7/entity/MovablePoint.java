package ru.mirea.task7.entity;

public class MovablePoint implements Movable {

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp() {
        this.y = this.y + ySpeed;
    }

    public void moveDown() {
        this.y = this.y - ySpeed;
    }

    public void moveLeft() {
        this.x = this.x + xSpeed;
    }

    public void moveRight() {
        this.x = this.x - xSpeed;
    }
}
