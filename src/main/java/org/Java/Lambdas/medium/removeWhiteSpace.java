package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class removeWhiteSpace {

    public static void main(String[] args) {
        List<String>

                strings=
                Arrays.asList("apple", "ban  ana", "kiwi", "orange", "pear", "straw berry", "waterm   elon");


        strings.stream()
                .map(s->s.replaceFirst(" +",""))
                .forEach(System.out::println);

    }
}
