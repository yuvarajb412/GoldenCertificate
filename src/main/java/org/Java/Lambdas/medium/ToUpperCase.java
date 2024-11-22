package org.Java.Lambdas.medium;

import org.Java.oops.AB;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        List<String> output
                =strings.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(output);

    }
}
