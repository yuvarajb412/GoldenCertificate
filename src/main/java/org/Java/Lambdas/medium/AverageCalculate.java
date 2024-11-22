package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AverageCalculate {

    public static void main(String[] args) {

        List<Integer>
                list= Arrays.asList(1,2,3,4,5,6,7);

    Double average= list.stream()
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(average);

    }
}
