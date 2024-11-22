package org.Java.CodingPracticeoops;

import java.util.*;

public class MapProblems {

    public static void main(String[] args) {


        List<String> products = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");


        TreeMap<String,Integer>

                map= new TreeMap<>();


        for (String s: products){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        System.out.println(map);

        System.out.println("------------------------");


        Map<Integer, Double> map1 = Map.of(1, 100.0, 2, 150.0, 3, 200.0);
        Map<Integer, Double> map2 = Map.of(2, 50.0, 3, 100.0, 4, 300.0);

       TreeMap<Integer,Double> doubleTreeMap
               = new TreeMap<>(Comparator.reverseOrder());

       for (Map.Entry<Integer,Double> entry:map1.entrySet()){
           doubleTreeMap.merge(entry.getKey(), entry.getValue(), Double::sum);
       }


    }
}
