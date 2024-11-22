package org.Java.Lambdas.medium;

import java.util.*;

public class MaxLengthString {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Optional<String> maxLengthString = strings.stream()
                .max(Comparator.comparingInt(String::length));
        maxLengthString.ifPresent(s -> System.out.println("String with maximum length: " + s));

    }
}
