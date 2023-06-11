package com.udemy.java;

import java.util.function.Function;

public class FunctionComposeAndThen {
    public static void main(String[] args) {
        Function<Integer, Integer> plus2 = (i) -> i +2;
        Function<Integer, Integer> square = (i) -> i*i;

        System.out.println(
                //66          //64
                plus2.compose(square).apply(8)
                //andThen: The functionality will be added to be executed in the last position of the execution flow.
                //andThen a.andThen(b) => a -> b

                //compose a.compose(b) => b -> a

                //compose: The functionality will be added to be executed in the first position of the execution flow.
                //compose, first run insided parameter, then stored data, then run another function.
                //Yani tersine muhendislik gibi dusunnebilirsin.
        );
    }
}
