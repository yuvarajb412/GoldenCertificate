package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class PrintVowels {


    public static void main(String[] args) {

        List<String>
                strings=
                Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "oai");

        strings.stream()
                .filter(s->s.matches("[aeiouAEIOU]+"))
                .forEach(System.out::println);

    }
}
