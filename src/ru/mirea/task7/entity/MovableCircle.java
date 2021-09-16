package ru.mirea.task7.entity;

public class MovableCircle implements Movable {

    private int Radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        Radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "Radius=" + Radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
