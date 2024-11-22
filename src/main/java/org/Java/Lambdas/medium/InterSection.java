package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class InterSection {

    public static void main(String[] args) {

            List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
            List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");


            list1.stream().filter(list2::contains)
                    .forEach(System.out::println);
    }
}
