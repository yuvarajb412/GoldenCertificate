package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class minLength {

    public static void main(String[] args) {

        List<String>
                list= Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");


     String find= list.stream()
                .min(Comparator.comparingInt(String::length))
             .orElse("not find");

        System.out.println(find);
    }



}
