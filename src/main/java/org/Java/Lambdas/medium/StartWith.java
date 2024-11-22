package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class StartWith {

    public static void main(String[] args) {

        List<String>
                strings
                =
                Arrays.asList("hello","banana","apple","animal");


          strings.stream()
                  .filter(s->s.startsWith("a"))
                  .forEach(System.out::println);

    }
}
