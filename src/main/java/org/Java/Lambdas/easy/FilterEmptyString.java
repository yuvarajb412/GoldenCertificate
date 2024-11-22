package org.Java.Lambdas.easy;

import java.util.Arrays;
import java.util.List;

public class FilterEmptyString {

    public static void main(String[] args) {

        List<String>
                list=
                Arrays.asList("hello", "", "world", "", "java");


        list.stream()
                .filter(f->!f.isEmpty())
                .forEach(System.out::println);

    }
}
