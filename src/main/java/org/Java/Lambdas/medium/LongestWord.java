package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestWord {

    public static void main(String[] args) {

        List<String>
                strings=
                Arrays.asList("apple", "banana", "watermelon", "pear");


      Optional<String> OUTPUT= strings.stream()
              .max((Comparator.comparing(String::length)));


        System.out.println(OUTPUT);



    }
}
