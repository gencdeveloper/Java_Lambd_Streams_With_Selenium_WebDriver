package com.udemy.java;

import com.udemy.java.lambda.GreetingService;
import com.udemy.java.polymorphism.Dog;

public class LambdaMain {
    public static void main(String[] args) {
        int a = 5;
        Dog d = new Dog();


        /***************OLD TYPE********************/

        GreetingService hiService = new GreetingService(){     /**we can create interface like this as well.*/

            @Override
            public void greet(String name){
                System.out.println("Hi with greet method " +name);
            }
        };

        /***************LAMBDA EXPRESSION TYPE********************/

        GreetingService helloService = (String name) ->{ /**This lambda expression*/
            System.out.println("Hello..." +name);
        };

        /**if you want to use just one line, you can type like this also*/
        GreetingService helloJustOneLine = (String name) ->System.out.println("Hello with one single line " +name);


        /**if you want, you can delete parameter type because it is optional in lambda*/
        GreetingService withoutParameterType = (name) ->System.out.println("Without Parameter type " +name);



        /**Notes: Lambda expression is basically an implementation of an interface
         The only condition is that interface should be having one abstract method*/

        /***************CALL PART********************/

        helloService.greet("Emre");

        helloJustOneLine.greet("Lambda expression");

        helloJustOneLine.greet("just one line");

        hiService.greet("with greet method");

        withoutParameterType.greet("Ruveyda");
    }
}
