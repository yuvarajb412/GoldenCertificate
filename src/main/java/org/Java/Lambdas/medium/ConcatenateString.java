package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateString {

    public static void main(String[] args) {

        List<String>
                list =
                Arrays.asList("apple", "banana", "cherry");


       String s=   list.stream()
                  .collect(Collectors.joining(", "," \"","\""));


        System.out.println(s);

    }
}
