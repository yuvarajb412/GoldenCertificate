package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class secondLargest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 8, 6, 10);

     Integer secondMax=   numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(-1);

        System.out.println(secondMax);




    }
}
