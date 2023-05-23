package com.udemy.java;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMainExp {

    public static void main(String[] args) {

        //we can say consumer.
        // it is including in java.util.Function package
        // void accept(T t);

        // package java.util.stream;
        // void forEach(Consumer<? super T> action);

        List<String> list = new ArrayList<>();
        list.add("Emre");
        list.add("Gul");


        //Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        //another way
        //list.forEach(s -> System.out.println(s.toUpperCase()));

        Consumer<String> dbConsumer = (s) -> System.out.println("I am writing into DB :: " + s);


        Consumer<String> loginConsumer = (s) -> System.out.println("I am writing into log file :: " + s);

        Consumer<String> dbLogConsumer = dbConsumer.andThen(loginConsumer);

        //Bi- Consumer
        BiConsumer<String, Integer> biConsumer = (s,i) ->{
            System.out.println("My name :: " + s);
            System.out.println("My aga :: " + i);
        };

        biConsumer.accept("Emre",30);

        Map<String, Consumer<String>> map = new HashMap<>();

        map.put("db", dbConsumer);
        map.put("log", loginConsumer);
        map.put("dblog",dbLogConsumer);

        map.forEach((k,v)->{
            System.out.println("Key is :: " + k);
        });
        list.forEach(map.get(System.getProperty("consumer-type")));

    }
}
