package org.Java.oopsadv;

import java.io.IOException;
import java.sql.SQLException;

public class MultiTry {

    public static void main(String[] args) {
        divide();

    }

   public static void divide(){

        int value =0;

        int[] a = new int[2];

        try {
            value=10/0;
            System.out.println(a[4]);
        }catch (ArithmeticException | IndexOutOfBoundsException  e) {
            System.out.println("error" + e);
        }


    }
}
