package org.Java.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetC {

    public static void main(String[] args) {

        int[] ints= {1,2,3,4,5,6,78,8,67,99,0,3,4,5,6,7};


        HashSet<Integer> list = new HashSet<>(Arrays.asList(1,2,3,5));

        for (int i=0;i<ints.length;i++){
            list.add(ints[i]);
        }


        System.out.println(list);

        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("sss", "cherry", "apple"));


        if(set1.containsAll(set2)){
            System.out.println("true");
        }


    }


}
