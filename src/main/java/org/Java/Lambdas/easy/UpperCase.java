package org.Java.Lambdas.easy;

import java.util.Arrays;
import java.util.List;

public class UpperCase {

    public static void main(String[] args) {

        List<String> strings =
                Arrays.asList("java", "stream", "api");

        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
