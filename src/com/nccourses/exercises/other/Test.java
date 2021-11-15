package com.nccourses.exercises.other;

import com.nccourses.exercises.chapter1.Chapter1;
import com.nccourses.exercises.chapter2.Car;
import com.nccourses.exercises.chapter2.Point;
import com.nccourses.exercises.chapter3.Employee;
import com.nccourses.exercises.chapter3.Measurable;

public class Test {
    public static void test(){

        Chapter1.toBOH(15);
        Chapter1.rands();
        System.out.println("normalize angle: " + Chapter1.normalize360(-10));
        Chapter1.maxMinDouble();
        System.out.println(Chapter1.factorial(1000));
        System.out.println("################################");

        //Chapter2
        Car car = new Car(1, 10);
        car.move(5);
        System.out.println(car);
        car.move(6);
        System.out.println(car);
        car.addFuel(2);
        car.move(1);
        System.out.println(car);
        System.out.println(new Point(3,4).translate(1,3).scale(0.5));
        System.out.println("################################");

        //chapter 3
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "1", 100);
        employees[1] = new Employee(2, "2", 300);
        employees[2] = new Employee(3, "3", 200);

        Measurable empLargestSalary = Measurable.largest(employees);
        Employee e = (Employee) empLargestSalary;
        System.out.println(e.getName());
        System.out.println("################################");
    }
}
