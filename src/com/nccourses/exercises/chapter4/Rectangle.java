package com.nccourses.exercises.chapter4;

import com.nccourses.exercises.chapter2.Point;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width / 2, point.getY() - height / 2 );
    }
}
