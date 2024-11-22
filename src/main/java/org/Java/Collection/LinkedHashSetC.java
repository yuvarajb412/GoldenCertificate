package org.Java.Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetC {
    public static void main(String[] args) {


        int value =100;


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0100,200,100,300));

        System.out.println(linkedHashSet);
        if(linkedHashSet.contains(value)){
            linkedHashSet.remove(value);
        }else {
            System.out.println("ll");
        }

        System.out.println(linkedHashSet);

    }
}
