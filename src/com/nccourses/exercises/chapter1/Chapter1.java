package com.nccourses.exercises.chapter1;

import java.math.BigInteger;
import java.util.*;

public class Chapter1 {

    //ex1
    //Write a program that reads an integer and prints it in binary, octal, and
    //hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
    public static void toBOH(int num){
        System.out.println("number: " + num);
        System.out.println("binary: " + Integer.toBinaryString(num));
        System.out.println("octal: " + Integer.toOctalString(num));
        System.out.println("hex: " + Integer.toHexString(num));
        System.out.println("reciprocal hex: " + Double.toHexString(1/((double)num)));
    }

    //ex2
    //Write a program that reads an integer angle (which may be positive or
    //negative) and normalizes it to a value between 0 and 359 degrees. Try
    //it first with the % operator, then with floorMod.
    public static int normalize360(int angle){
        angle %= 360;
        if (angle < 0)
            angle += 360;
        return angle;
    }

    public static double normalizeFloorMod(int angle){
        return Math.floorMod(angle, 360);
    }

    //ex3
    //Using only the conditional operator, write a program that reads three
    //integers and prints the largest. Repeat with Math.max.
    public static int maximum(int first, int second, int third){
        int large;
        if (first > second) {
            if (first > third)
                large = first;
            else
                large = third;
        }
        else {
            if (second > third)
                large = second;
            else
                large = third;
        }
        return large;
    }

    public static int maximumMath(int first, int second, int third){
        return Math.max(Math.max(first, second), third);
    }

    //ex4
    //Write a program that prints the smallest and largest positive double values.
    //Hint: Look up Math.nextUp in the Java API.
    public static void maxMinDouble(){
        System.out.println("max double: " + Double.MAX_VALUE);
        System.out.println("min pos double: " + Math.nextUp(0.0d));
    }

    //ex6
    //Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
    //BigInteger. Compute the factorial of 1000.
    public static BigInteger factorial(int n){
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++)
            res = res.multiply(BigInteger.valueOf(i));
        return res;
    }

    //ex13
    //Write a program that prints a lottery combination, picking six distinct
    //numbers between 1 and 49. To pick six distinct numbers, start with an
    //array list filled with 1...49. Pick a random index and remove the element.
    //Repeat six times. Print the result in sorted order
    public static void rands(){
        List<Integer> result = new LinkedList<>();
        List<Integer> numbers = new LinkedList<>();
        for(int i = 1; i <= 49; i++)
            numbers.add(i);
        for(int i = 0; i < 6; i++){
            int ind = (int)(Math.random() * numbers.size());
            result.add(numbers.get(ind));
            numbers.remove(ind);
        }
        Collections.sort(result);
        System.out.println(numbers);
        System.out.println(result);
    }
}
