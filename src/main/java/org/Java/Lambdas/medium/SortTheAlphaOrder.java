package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheAlphaOrder {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");

        System.out.println(strings.stream().sorted().collect(Collectors.toList()));



    }
}
