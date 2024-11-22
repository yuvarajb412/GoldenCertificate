package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheString {

    public static void main(String[] args) {

        List<String>

                strings= Arrays.asList("apple","banana","kiwi","orange","pear");


        strings.stream()
                .map(s-> new StringBuffer(s).reverse()).forEach(System.out::println);

    }
}
