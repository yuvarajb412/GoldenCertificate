package org.Java.Lambdas.easy;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordsByLength {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fish");

        Map<Integer,List<String>> groupWords  =
                words.stream()
                        .collect(Collectors.groupingBy(
                                String::length,
                                Collectors.mapping(
                                        a->a,
                                        Collectors.toList()
                                )
                        ));

        System.out.println(groupWords);

        Map<Integer,Long> byLength
                = words.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.counting()
                        )
                );

        System.out.println(byLength);

    }
}
