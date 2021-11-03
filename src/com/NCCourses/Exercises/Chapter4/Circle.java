package com.NCCourses.Exercises.Chapter4;

import com.NCCourses.Exercises.Chapter2.Point;

public class Circle extends Shape{
    double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Circle clone(){
        return new Circle(point, radius);
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX(), point.getY());
    }
}