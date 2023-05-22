package com.udemy.java;

import java.util.function.*;

public class SupplierInterfaceMainExp {

    public static void main(String[] args) {
        Supplier<Double> random = Math::random;
        System.out.println(random.get());
    }
}
