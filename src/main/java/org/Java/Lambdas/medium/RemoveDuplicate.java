package org.Java.Lambdas.medium;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);

         List<Integer> du= numbers.stream().distinct()
                 .toList();

        System.out.println(du);

    }
}
