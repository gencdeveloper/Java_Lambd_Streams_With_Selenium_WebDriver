package com.udemy.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> isGT2 = (n) -> n >2;
        Predicate<Integer> isLT10 = (n) -> n <10;

//        System.out.println(isGT2.test(3));
//        System.out.println(isLT10.test(13));

        System.out.println(isGT2.and(isLT10).test(5));
        System.out.println(isGT2.negate().test(3));

        //Another example with Predicate

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> evenNumbers = filter(numbers,isEven);
        System.out.println(evenNumbers);

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
