package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class SameLength {

    public static void main(String[] args) {

        List<String>
                strings

                = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");

      boolean va=  strings.stream()
                .map(String::length)
                .distinct()
                .count()==1;

        System.out.println(va);

    }
}
