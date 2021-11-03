package com.NCCourses.Exercises.Chapter4;

import com.NCCourses.Exercises.Chapter2.Point;

public class Line extends Shape{
    Point pointTo;

    public Line(Point from, Point to) {
        super(from);
        this.pointTo = new Point(to.getX(), to.getY());
    }

    @Override
    public Line clone(){
        return new Line(point, pointTo);
    }

    @Override
    public Point getCenter() {
        return new Point((pointTo.getX() + point.getX()) / 2, (pointTo.getY() + point.getY()) / 2 );
    }
}
