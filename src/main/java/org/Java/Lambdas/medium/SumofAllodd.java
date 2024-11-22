package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class SumofAllodd {

    public static void main(String[] args) {

        List<Integer>
                list=
                Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer reduce = list.stream()
                .filter(s -> s % 2 == 1)
                .reduce(0, Integer::sum);

        System.out.println(reduce);

    }
}
