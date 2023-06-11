package com.udemy.java;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class CallableFunctionMain {
    public static void main(String[] args) throws Exception {
        //Callable --> it has to throws exception


        Supplier<Double> random1 = () ->Math.random();
        Callable<Double> random2 = () ->Math.random();

//        System.out.println(random1.get());
//        System.out.println(random2.call());

        test(random2); //--> this method return Callable function because you call Callable with @test method
    }

    private static void test(Callable callable) throws Exception {
        System.out.println(callable.call());
    }
}
