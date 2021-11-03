package com.NCCourses.Exercises.Chapter2;

//Implement a class Car that models a car traveling along the x-axis, consuming
//gas as it moves. Provide methods to drive by a given number of
//miles, to add a given number of gallons to the gas tank, and to get the
//current distance from the origin and fuel level. Specify the fuel efficiency
//(in miles/gallons) in the constructor. Should this be an immutable class?
//Why or why not?
public class Car {
    private double x;
    private double efficiency;
    private double gas;

    public Car(double efficiency, double gas) {
        this.efficiency = efficiency;
        this.gas = gas;
        this.x = 0;
    }

    public void move(double dx){
        if (dx * efficiency < gas){
            x += dx;
            gas -= dx * efficiency;
        }
        else
        {
            x += gas / efficiency;
            gas = 0;
        }
    }

    public double getDistance() {
        return x;
    }

    public void addFuel(double gas){
        this.gas += gas;
    }

    public double getFuelLevel(){
        return gas;
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", efficiency=" + efficiency +
                ", gas=" + gas +
                '}';
    }
}
