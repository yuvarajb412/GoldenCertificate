package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class Contains {

    public static void main(String[] args) {

        List<String>
                list= Arrays.asList(
                "apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");


        list.stream()
                .filter(s->s.contains("an"))
                .forEach(System.out::println);

    }
}
