package org.Java.oopsadv;

public class tryFinally {

        public static void main(String[] args) {
            divide();

        }


        public static void divide(){

            int value =0;

            int[] a = new int[2];

            try {
                value=10/0;
                System.out.println(a[4]);
            }catch (ArithmeticException |IndexOutOfBoundsException  e) {
                System.out.println("error" + e);
            }finally {
                System.out.println("after the catch block");
            }


        }
    }


