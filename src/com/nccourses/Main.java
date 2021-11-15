package com.nccourses;

import com.nccourses.exercises.chapter3.Employee;
import com.nccourses.exercises.chapter3.Measurable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Test.test();

        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "1", 100);
        employees[1] = new Employee(2, "2", 300);
        employees[2] = new Employee(3, "3", 200);

        Measurable empLargestSalary = Measurable.largest(employees);
        Employee e = (Employee) empLargestSalary;
        System.out.println(e.getName());
    }
}
