package org.Java.Collection;

import java.util.*;

public class ArrayListProblem {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,6,7,8,9,1,2,3,4));
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(2,3,4,5,6));

        list.retainAll(list1);
        System.out.println(list);
        ArrayList<Integer> list2= new ArrayList<>(2);
        list2.add(20);
        list2.add(22);
        list2.add(22);
        list2.add(22);


     list1.reversed();

    }
}
