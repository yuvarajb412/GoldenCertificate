package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNull {

    public static void main(String[] args) {

        List<String>
                list=
                Arrays.asList("apple",null,"banana",null,"kiwi","Orange",null,"pear");

        list.stream().filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
