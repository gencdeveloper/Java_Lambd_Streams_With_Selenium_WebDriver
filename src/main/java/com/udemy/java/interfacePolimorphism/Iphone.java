package com.udemy.java.interfacePolimorphism;

public class Iphone implements Alarm{
    public void dial(){
        System.out.println("Calling 123...");
    }

    public void answerPhone(){
        System.out.println("Hello");
    }

    public void setAlarm(){
        System.out.println("Iphone Setting an alarm @7:30AM");
    }
}
