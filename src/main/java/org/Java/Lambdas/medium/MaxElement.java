package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElement {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(2, 4, 8, 6, 10);


       int max= numbers.stream()
                       .max(Integer::compareTo).get();

        System.out.println(max);


    }
}
