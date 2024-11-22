package org.Java.Lambdas.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DifMaxMin {

    public static void main(String[] args) {

        List<Integer>

                list= Arrays.asList(1,2,3,4,5,6,7,8,9);


  OptionalInt max= list.stream()
                .mapToInt(Integer::intValue).max();

  OptionalInt min=list.stream()
          .mapToInt(Integer::intValue).min();


  int value=max.getAsInt()-min.getAsInt();

        System.out.println(value);



    }
}
