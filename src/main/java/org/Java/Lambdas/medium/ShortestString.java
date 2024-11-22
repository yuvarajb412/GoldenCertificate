package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ShortestString {

    public static void main(String[] args) {

            List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

          Optional<String> s= strings.stream()
                     .min(Comparator.comparingInt(String::length));


        System.out.println(s);
    }
}
