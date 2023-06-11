package com.udemy.java;

import com.google.common.util.concurrent.Uninterruptibles;

import java.util.concurrent.TimeUnit;

public class RunnableFunctionMain {

    //Runnable
    //Callable

    public static void main(String[] args) {
        //Runnable does not accept anything and not return anything
        Runnable r = ()-> {
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            System.out.println("Hello World");
        };

        //Who use Runnable function, if you are use thread that time u can pass as a runnable

        //Like this
        new Thread(r).start();
        System.out.println("Hi");

    }

}
