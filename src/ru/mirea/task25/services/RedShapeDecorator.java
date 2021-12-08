package ru.mirea.task25.services;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape service) {
        super(service);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
//Реализовать отрисовку красной рамки
    }
}
