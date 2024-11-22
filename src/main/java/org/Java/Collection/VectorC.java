package org.Java.Collection;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorC {
    public static void main(String[] args) {


        Vector<Integer> vector= new Vector<>();
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
        vector.addElement(50);

        vector.remove(1);

        System.out.println(vector.size());
        System.out.println(vector);

        Vector<Integer> vector1 = new Vector<>(3);
        System.out.println(vector.capacity());
        System.out.println(vector1.size());
        vector1.addElement(5);
        vector1.addElement(10);
        vector1.addElement(15);
        vector1.addElement(20);
        vector1.addElement(25);

        System.out.println(vector1.capacity());
        System.out.println(vector1.size());





    }
}
