package com.udemy.java;

import com.udemy.java.lambda.GreetingService;
import com.udemy.java.lambda.PureFunctionInterface;

import java.util.ArrayList;
import java.util.List;

public class PureFunctionMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("GUL");

        PureFunctionInterface p1 = (n) ->{
            return n.toUpperCase() + list.get(1);
        };
        System.out.println(p1.greet("Emre"+" "));
    }

}