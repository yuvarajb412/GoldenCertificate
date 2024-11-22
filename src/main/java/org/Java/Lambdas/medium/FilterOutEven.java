package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class FilterOutEven {

    public static void main(String[] args) {

        List<Integer>
                integers= Arrays.asList(1,2,3,4,5);


     List<Integer> output=   integers.stream()
                .filter(a->a%2==0)
                .toList();

        System.out.println(output);


    }
}
