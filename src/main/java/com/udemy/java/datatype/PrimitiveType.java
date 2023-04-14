package com.udemy.java.datatype;

public class PrimitiveType {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Before :: " + i);
       change(i);
        System.out.println("After :: " + i);

        //after change method result will return 5 again why?
        //because we are not storing to value,
        //java just passing value

    }

                                 //5
    private static void change(int a){
        a++; //a=a+1
    }
}
