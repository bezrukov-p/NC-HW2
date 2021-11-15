package com.nccourses.exercises.chapter4;


import com.nccourses.exercises.chapter2.Point;

//4. Define an abstract class Shape with an instance variable of class Point, a
//constructor, a concrete method public void moveBy(double dx, double dy) that
//moves the point by the given amount, and an abstract method public Point
//getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
//public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
//double height), and public Line(Point from, Point to).
//5. Define clone methods for the classes of the preceding exercise.
public abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy){
        point = point.translate(dx, dy);
    }

    public abstract Point getCenter();
}
