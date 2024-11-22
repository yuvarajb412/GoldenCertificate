package org.Java.Lambdas.hard;

import java.util.Arrays;
import java.util.List;

public class palindrome {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mam","stress","home");


    List<String> value=   list.stream()
                .filter((s)->new StringBuffer(s).reverse().toString()
                            .equals(s)).toList();

    System.out.println(value);
    }
}
