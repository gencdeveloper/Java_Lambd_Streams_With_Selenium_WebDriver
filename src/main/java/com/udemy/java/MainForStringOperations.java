package com.udemy.java;

import com.udemy.java.lambda.StringOperations;

public class MainForStringOperations {
    public static void main(String[] args) {

        StringOperations op1 = System.out::println; //this is a lambda

        op1.accept("method referances");
    }
}
