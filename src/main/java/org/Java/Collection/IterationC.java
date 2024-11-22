package org.Java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationC {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        int count =2;

        for (int i=0;i<5;i++){
            list.add(i+20+count);
        }
        System.out.println("list size before"+list.size());//5

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println("list size after"+list.size());

    }
}
