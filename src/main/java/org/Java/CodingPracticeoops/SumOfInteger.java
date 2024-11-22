package org.Java.CodingPracticeoops;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SumOfInteger {
    public static void main(String[] args) {

        List<Integer>
                integers= Arrays.asList(1,2,3,4,5);


        System.out.println((Integer) integers.stream().mapToInt(Integer::intValue).sum())
        ;
        System.out.println("------------");
        System.out.println("-----maximum int-------");
        System.out.println( integers.stream()
                .sorted()
                .max(Comparator.comparingInt(Integer::intValue)));

        System.out.println("----------------");
        integers.stream()
                .filter(a->a%2==0)
                .forEach(System.out::println);

        System.out.println("-----------------");

      List<String>
              stringList =Arrays.asList("apple","banana",
              "orange","grape");

    long v=  stringList.stream()
              .filter(a->a.contains("a"))
              .count();
        System.out.println(v);
        System.out.println("-------------");

        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-----------------");

     OptionalDouble z= integers.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(z);
        System.out.println("-----------");

        List<String> sortIn =Arrays
                .asList("banana","orange",
                        "apple","grape");

        sortIn.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------------");


        String x=sortIn.stream()
                .collect(Collectors.joining());
        System.out.println(x);
        System.out.println("-------------");


        System.out.println(sortIn.stream()
               .max(Comparator.comparing(String::length)))
                ;
        System.out.println(sortIn.stream()
                .mapToInt(String::length).max());

        System.out.println("-------------");

        System.out.println(integers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst() );
        System.out.println("--------------");
          List<Integer>
                  list=Arrays.asList(1,2,3,4,5,6,7,8,1);

                list.stream().distinct()
                        .forEach(System.out::println);


        System.out.println("-----------");

        System.out.println(sortIn
                .stream()
                .min(Comparator.comparingInt(String::length)));

        System.out.println("-----------");

        integers.stream()
                .map(a->a*a)
                .forEach(System.out::println);

        System.out.println("------------");

        sortIn.stream()
                .filter(a->a.startsWith("a")
                        ).forEach(System.out::println);

        System.out.println("-----------------");

        System.out.println(
                integers.stream()
                        .reduce(1,(a,b)->a*b)
        );

        System.out.println("----------------------");

        integers.stream()
                .filter(a->a%2==0)
                .forEach(System.out::println);

        System.out.println("-----------");

        stringList.stream()
                .map(s->new StringBuffer(s).reverse().toString())
                .forEach(System.out::println);

        System.out.println("-----------------");

        System.out.println(integers.stream()
                .filter(a->a%2==1)
                .mapToInt(Integer::intValue)
                .sum());

        System.out.println("------------------");

        stringList.stream()
                .filter(s->s.matches("[aeiouAEIOU]+.*")
                        )
        .forEach(System.out::println);

        System.out.println("-----------29---");




    }
}
