package com.udemy.java;

import com.udemy.java.lambda.GreetingService;
import com.udemy.java.lambda.HighOrderFunction;

public class LambdaExecuted {
    public static void main(String[] args) {
        System.out.println("Starting execution");

        test(s->{ //Lambda is not method call or executable call just it is DECLARATION!
            System.out.println("Inside lambda");
            return s.toUpperCase();
        });

        System.out.println("Ending execution");
    }

    private static int getNumber(){
        System.out.println("Called getNumber");
        return 5;
    }

    private static void receiveNumber(int i){
        System.out.println("Received number is :: " + i);

    }

    private static void test(HighOrderFunction g){
        System.out.println("Inside test method. Received greeting sercive");
        String returnedString = g.utilities("udemy");
        System.out.println(returnedString);
    }
}
