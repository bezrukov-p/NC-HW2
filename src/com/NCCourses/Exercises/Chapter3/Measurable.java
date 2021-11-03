package com.NCCourses.Exercises.Chapter3;

//  Provide an interface Measurable with a method double getMeasure() that measures
//an object in some way. Make Employee implement Measurable. Provide
//a method double average(Measurable[] objects) that computes the average
//measure. Use it to compute the average salary of an array of employees.
//  Continue with the preceding exercise and provide a method Measurable
//largest(Measurable[] objects). Use it to find the name of the employee with
//the largest salary. Why do you need a cast?
public interface Measurable {

    double getMeasure();

    static double average(Measurable... objects){
        double res = 0;
        for(Measurable elem : objects){
            res += elem.getMeasure();
        }
        return res/objects.length;
    }

    static Measurable largest(Measurable... objects) {
        int indMax = 0;
        double max = objects[0].getMeasure();
        for (int i = 1; i < objects.length; i++){
            if (objects[i].getMeasure() > max){
                indMax = i;
                max = objects[i].getMeasure();
            }
        }
        return objects[indMax];
    }
}
