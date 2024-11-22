package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class ListOfIntegerSquare {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);


         list.stream().
                 map(a-> a*a)
                 .toList().forEach(System.out::println);


    }


}
