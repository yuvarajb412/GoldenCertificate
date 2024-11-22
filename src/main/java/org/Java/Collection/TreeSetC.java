package org.Java.Collection;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetC {
    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(20,30,104,503,38,3810,60));


       for (Integer integer :treeSet){
           if(integer>=25 && integer<=55){
               System.out.println(integer);
           }
       }

        System.out.println(treeSet.first() +"  "+treeSet.last());
        System.out.println(treeSet);

        System.out.println(treeSet.ceiling(28));
        System.out.println(treeSet.floor(28));
    }
}
