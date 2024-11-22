package org.Java.Collection;

import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {

        int[] array = {3, 1, 4, 1, 5, 9, 2, 6};
        int k =3;

        Deque<Integer> deque= new ArrayDeque<>();

        Deque<Integer> deque1 = new LinkedList<>();


        PriorityQueue<Integer> queue=new PriorityQueue<>();

        for (int i=0;i<array.length;i++){
            queue.add(array[i]);
        }

        System.out.println(queue);

        int start =array.length-k;

        for (int i=0;i<array.length;i++){

            if(i>=start) {
                System.out.println(queue.poll());
            }else {
                queue.poll();
            }
        }




    }
}
