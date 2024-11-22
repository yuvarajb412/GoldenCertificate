package org.Java.Lambdas.newlambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountByWordsAndLength {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fish");

    Map<Integer,List<String>> byLength=    words.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length


                        )
                );
        System.out.println(byLength);
        System.out.println("-------------------------------");

    Map<Integer,Long>   s= words.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.counting()
                        )
                );

        System.out.println(s);
        System.out.println("---------------------");


    }
}
