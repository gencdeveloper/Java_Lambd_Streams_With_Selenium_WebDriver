package com.udemy.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Emre");
        list.add("Gul");


        Consumer<String> dbConsumer = (s) -> System.out.println("I am writing into DB :: " + s);


        Consumer<Integer> loginConsumer = (s) -> System.out.println("I am writing into log file :: " + s);

        //for the consumer chaining you have to use same type, you can not use String and Integer
        //you have to use String and String or Integer or Integer or another same type

        //like this code
        //Consumer<String> dbLogConsumer = dbConsumer.andThen(loginConsumer);


    }
}
