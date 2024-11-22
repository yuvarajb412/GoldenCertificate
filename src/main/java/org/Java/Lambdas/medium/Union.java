package org.Java.Lambdas.medium;

import org.Java.Lambdas.Strem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Union {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);


        Stream.concat(list1.stream(),list2.stream())
                .distinct()
                .forEach(System.out::println);

    }
}
