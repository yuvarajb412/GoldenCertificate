package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatString {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");

     String s=   strings.stream()
                .collect(Collectors.joining());

        System.out.println(s);

    }
}
