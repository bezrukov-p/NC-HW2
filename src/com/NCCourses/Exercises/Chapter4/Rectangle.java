package com.NCCourses.Exercises.Chapter4;

import com.NCCourses.Exercises.Chapter2.Point;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone(){
        return new Rectangle(point, width, height);
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width / 2, point.getY() - height / 2 );
    }
}
