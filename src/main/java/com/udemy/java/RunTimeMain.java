package com.udemy.java;

import com.udemy.java.polymorphism.Animal;
import com.udemy.java.polymorphism.Cat;
import com.udemy.java.polymorphism.Dog;
import com.udemy.java.polymorphism.Horse;

public class RunTimeMain {
    public static void main(String[] args) {

        //Dog d = new Dog();
        //Cat d = new Cat();
        Horse d = new Horse();
        test(d);
    }


/**    Run time polymorphism is implemented through Method overriding.
//     you can create one super class then u can inherit with sub class, so combined same method inside to super class
//    then call from there. if some same method function not same, you can override like a "make a sound" method for animals.
//
//    finally, while test from main, u can create class object then u can import super class like Animal..
//    then u can use just with one method. you dont have to create multiple methods
//     like test(Animal d) each walk same properties but each sound different. we override in their class
 */
    private static void test(Animal d){
        d.makeSound();
        d.walk();
    }

}
