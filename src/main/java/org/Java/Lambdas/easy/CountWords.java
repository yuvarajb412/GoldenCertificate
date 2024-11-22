package org.Java.Lambdas.easy;

import java.util.Arrays;
import java.util.List;

public class CountWords {

    public static void main(String[] args) {
        List<String>
                strings= Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");


      long count=  strings.stream()
                .filter(s->s.startsWith("A"))
                .count();

        System.out.println(count);


    }
}
