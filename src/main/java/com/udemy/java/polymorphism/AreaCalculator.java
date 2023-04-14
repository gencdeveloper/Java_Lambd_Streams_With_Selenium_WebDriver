package com.udemy.java.polymorphism;

public class AreaCalculator {

    /**Method Overloading occurs when a class has many methods with the same name but different parameters.*/

    public int getArea(int side){
        //square
        return side * side;
    }

    public double getArea(double side){
        //calculate square with decimal
        return side * side;
    }
    public double getArea(double length,double weight){
        // if you want to calculate rectangle, you can use this method.
        return length * weight;
    }
}
