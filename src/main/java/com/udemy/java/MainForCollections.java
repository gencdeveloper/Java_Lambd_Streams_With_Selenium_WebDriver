package com.udemy.java;

import com.udemy.java.interfacePolimorphism.Alarm;
import com.udemy.java.interfacePolimorphism.Clock;
import com.udemy.java.interfacePolimorphism.GoogleMini;
import com.udemy.java.interfacePolimorphism.Iphone;
import com.udemy.java.polymorphism.Animal;
import com.udemy.java.polymorphism.Cat;
import com.udemy.java.polymorphism.Dog;
import com.udemy.java.polymorphism.Horse;

import java.util.ArrayList;
import java.util.List;

public class MainForCollections {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);

        int number = 50;
        Integer refInt = number;//this is reference type Integer

        //unboxing
        int number2 = refInt;

        Dog d = new Dog();
        Cat c = new Cat();
        Horse h = new Horse();


        List <Animal> l = new ArrayList();
        l.add(d);
        l.add(c);
        l.add(h);

        List<Alarm> a = new ArrayList<>();

        GoogleMini g = new GoogleMini();
        Iphone i = new Iphone();
        Clock clock = new Clock();

        a.add(g);
        a.add(i);
        a.add(clock);


    }









}
