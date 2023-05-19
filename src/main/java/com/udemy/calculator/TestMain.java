package com.udemy.calculator;

public class TestMain {

    public static void main(String[] args) {
        MathOperation add = (a,b) -> a+b;
        MathOperation subtract = (a,b) -> a -b;
        MathOperation multiply = (a,b) -> a *b;
        MathOperation divide = (a,b) -> a / b;


        System.out.println(calculate(add));
        System.out.println(calculate(subtract));
        System.out.println(calculate(multiply));
        System.out.println(calculate(divide));

    }

    private static int calculate(MathOperation mathOperation){
        int a = 100;
        int b = 5;
        return mathOperation.operate(a,b);
    }



}
