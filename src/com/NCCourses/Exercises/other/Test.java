package com.NCCourses.Exercises.other;

import com.NCCourses.Exercises.Chapter1.Chapter1;
import com.NCCourses.Exercises.Chapter2.Car;
import com.NCCourses.Exercises.Chapter2.Point;
import com.NCCourses.Exercises.Chapter3.Employee;
import com.NCCourses.Exercises.Chapter3.Measurable;
import com.NCCourses.Exercises.Chapter4.Circle;
import com.NCCourses.Exercises.Chapter4.Line;

public class Test {
    public static void test(){
        //Chapter1
        Chapter1.ex1(10);
        Chapter1.ex2(-1);
        Chapter1.ex3(3, 1, 2);
        Chapter1.ex4();
        Chapter1.ex6(1000);
        Chapter1.ex13();

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

        Employee[] arr = new Employee[3];
        arr[0] = new Employee(1, "1", 100);
        arr[1] = new Employee(2, "2", 200);
        arr[2] = new Employee(3, "3", 300);

        System.out.println(Measurable.average(arr));

        //chapter 4

    }
}
