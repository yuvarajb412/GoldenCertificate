package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class SpecificLength {

    public static void main(String[] args) {

        List<String>
                strings=
                Arrays.asList("hello", "java", "world", "streams", "api");

        strings.stream()
                .filter(a-> a.length()>=5)
                .forEach(System.out::println);

    }
}
