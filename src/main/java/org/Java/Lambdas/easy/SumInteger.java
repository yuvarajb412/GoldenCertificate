package org.Java.Lambdas.easy;

import java.util.Arrays;
import java.util.List;

public class SumInteger {

    public static void main(String[] args) {

        List<Integer>
                list=Arrays.asList(5, 10, 15);

        int sum=   list.stream()
                .reduce(0,Integer::sum);

        System.out.println(sum);

    }
}
