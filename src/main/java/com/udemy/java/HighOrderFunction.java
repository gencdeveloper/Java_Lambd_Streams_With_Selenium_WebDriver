package com.udemy.java;

public class HighOrderFunction {
    public static void main(String[] args) {
        //Function as First Class Object
        //This is first class object function. (Ability to assign a function to a variable - having a ref of function)


        test(name -> name.toUpperCase());
        test(name -> name.toLowerCase());
        test(name -> name.length() + "");

    }
    //this method passing data has the data
    private static void convertToUpperCase(String s){
        String returnedString = s.toUpperCase();
        System.out.println(returnedString);
    }
    //this method passing data has the data
    private static void convertToLowerCase(String s){
        String returnedString = s.toLowerCase();
        System.out.println(returnedString);
    }

    //this method has the data we are passing the behavior
    private static void test(com.udemy.java.lambda.HighOrderFunction g){
        String returnedString = g.utilities("udemy");
        System.out.println(returnedString);
    }
}
