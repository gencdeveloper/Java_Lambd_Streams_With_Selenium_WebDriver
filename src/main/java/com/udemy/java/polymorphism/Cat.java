package com.udemy.java.polymorphism;
                    //IS A/AN
public class Cat extends Animal{

 //hey, you can inherit everything from Animal Class except makeSound method
 // because i am a cat and i am meowwww
 @Override
    public void makeSound(){
        System.out.println("I am cat. meow....");
    }




}
