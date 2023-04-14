package com.udemy.java.datatype;

import java.util.Arrays;

/**
 * Remember! Java is always pass value, even though we send our reference
 */

public class ReferenceType {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

        predict(arr);

        totalSale(arr);


    }

    private static void predict(int[] a) {
        a = Arrays.copyOf(a,a.length);
        a[0]++;
        a[1]++;
        System.out.println("Prediction for next month :: " + (a[0] + a[1] + a[2]));
    }

    private static void totalSale(int[] a) {
        System.out.println("Total sale for this month:: " + (a[0] + a[1] + a[2]));
    }
}
