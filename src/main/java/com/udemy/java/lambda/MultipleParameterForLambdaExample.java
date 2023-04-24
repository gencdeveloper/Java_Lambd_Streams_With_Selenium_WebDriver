package com.udemy.java.lambda;

//SAM - single abstract method
/**Notes: Lambda expression is basically an implementation of an interface
 The only condition is that interface should be having one abstract method*/



@FunctionalInterface
public interface MultipleParameterForLambdaExample {
    void information(String name,String LastName, int Age);

}
