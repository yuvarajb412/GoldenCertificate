package org.Java.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strem {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,67);

       int sum= list.stream()
                .reduce(0,(a,b)->a+b);

        System.out.println(sum);

        List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(6,7,8,9));


        List<Integer> single= list1.stream().flatMap(li->li.stream()).collect(Collectors.toList());

        System.out.println(single);







    }
}
