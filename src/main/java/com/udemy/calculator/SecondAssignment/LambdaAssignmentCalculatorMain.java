package com.udemy.calculator.SecondAssignment;



public class LambdaAssignmentCalculatorMain {
    public static void main(String[] args) {
        SecondMathOperation add = (a, b) -> a+b;
        SecondMathOperation subtract = (a,b) -> a -b;
        SecondMathOperation multiply = (a,b) -> a *b;
        SecondMathOperation divide = (a,b) -> a / b;

        int onScreenNumber = 0;
        onScreenNumber = calculate(5,add,2);
        onScreenNumber = calculate(onScreenNumber,subtract,3);
        onScreenNumber = calculate(onScreenNumber,multiply,7);
        onScreenNumber = calculate(onScreenNumber,add,2);
        onScreenNumber = calculate(onScreenNumber,divide,3);

        System.out.println(onScreenNumber);

    }

    private static int calculate(int onScreenNumber,SecondMathOperation secondMathOperation, int enteredNumber){
       return secondMathOperation.operate(onScreenNumber, enteredNumber);
    }
}
