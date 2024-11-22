package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class Product {

    public static void main(String[] args) {

        List<Integer>
                list=
                Arrays.asList(1,2,3,4,5);

        list.stream()
                .reduce((a,b)->a*b)
                .ifPresent(System.out::println);

    }
}
