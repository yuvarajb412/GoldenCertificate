package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class ContainsA {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");


        long output= strings.stream()
                 .filter(a->a.contains("a"))
                         .count();

        System.out.println(output);

    }
}
