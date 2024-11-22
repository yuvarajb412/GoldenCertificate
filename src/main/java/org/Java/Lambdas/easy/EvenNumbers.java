package org.Java.Lambdas.easy;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {

        List<Integer>
                list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> list1=  list.stream()
                .filter(a->a%2==0)
                   .toList();

        System.out.println(list1);

    }
}
