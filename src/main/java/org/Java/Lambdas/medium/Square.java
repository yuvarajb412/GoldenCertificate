package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class Square {

    public static void main(String[] args) {

        List<Integer>
                list= Arrays.asList(2, 3, 2, 4, 3);

          list.stream()
                  .map(a->a*a)
                  .distinct()
                  .sorted()
                  .forEach(System.out::println);

    }
}
