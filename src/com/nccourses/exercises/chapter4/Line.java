package com.nccourses.exercises.chapter4;

import com.nccourses.exercises.chapter2.Point;

public class Line extends Shape implements Cloneable{
    private Point pointTo;

    public Line(Point from, Point to) {
        super(from);
        this.pointTo = to;
    }

    @Override
    public Point getCenter() {
        return new Point((pointTo.getX() + point.getX()) / 2, (pointTo.getY() + point.getY()) / 2 );
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointTo=" + pointTo +
                ", point=" + point +
                '}';
    }
}
