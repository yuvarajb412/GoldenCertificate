package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class oddNumbers {

    public static void main(String[] args) {

        List<Integer>
                Values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Values.stream()
                .filter(s->s%2==1)
                .forEach(System.out::println);
    }
}
