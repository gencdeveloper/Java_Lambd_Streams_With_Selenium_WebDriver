package com.udemy.java;

import java.util.function.Function;

public class TestMainFunction {
    public static void main(String[] args) {
                        //First function it has to return integer because it will chain with second function.
                        //If you not return integer, your code will give u error.
        Function<String, Integer> strLen = (s) -> s.length();
        Function<Integer, Integer> square = (i) -> i*i;

        System.out.println(
                //20 -> there is just taking string length
                    //strLen.apply("hi hello how are you")


                //Then we make chaining with new function and we will get its square
                //400
                strLen.andThen(square).apply("hi hello how are you")
        );
    }
}
