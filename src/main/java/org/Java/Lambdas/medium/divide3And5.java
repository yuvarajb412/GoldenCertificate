package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class divide3And5 {

    public static void main(String[] args) {

        List<Integer>
                strings=
                Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);


        strings.stream()
                .filter(a-> a%3==0 && a%5==0)
                .forEach(System.out::println);

    }
}
