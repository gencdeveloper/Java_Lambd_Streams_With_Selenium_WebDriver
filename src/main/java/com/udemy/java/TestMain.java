package com.udemy.java;

import com.udemy.java.polymorphism.AreaCalculator;
/** Polymorphism allows us to perform the same action in multiple ways in Java.
 *
 * Polymorphism is divided into two types:
 *
 *   Compile-time polymorphism: Compile Time polymorphism is implemented through Method overloading and Operator overloading.
 *   Run time polymorphism :   Run time polymorphism is implemented through Method overriding.
 *
 * */

public class TestMain {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        /**Compile-time polymorphism: Compile Time polymorphism is implemented through Method overloading and Operator overloading.
        Method Overloading occurs when a class has many methods with the same name but different parameters.*/
            System.out.println(a.getArea(5)); // it is pass int value as well because connected with int getArea method
            System.out.println(a.getArea(5.33)); // it is pass decimal number as well because connected with double getArea method
            System.out.println(a.getArea(5,4));
    }
}
