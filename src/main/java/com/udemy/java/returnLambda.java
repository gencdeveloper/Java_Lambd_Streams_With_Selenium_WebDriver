package com.udemy.java;

import com.udemy.java.lambda.HighOrderFunction;

public class returnLambda {
    public static void main(String[] args) {

        String ss = getLambda().utilities("pass data");
        System.out.println("Inside test method. Received greeting service");
    }



    private static void test(HighOrderFunction g){
        System.out.println("Inside test method. Received greeting sercive");
        String returnedString = g.utilities("udemy");
        System.out.println(returnedString);
    }

    //function as first class objects.
    private static HighOrderFunction getLambda(){

        return (g) -> g.toUpperCase();
    }
}
