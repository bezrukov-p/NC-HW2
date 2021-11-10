package com.NCCourses.Exercises.Chapter4;

import com.NCCourses.Exercises.Chapter2.Point;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", point=" + point +
                '}';
    }
}