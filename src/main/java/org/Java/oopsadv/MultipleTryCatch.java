package org.Java.oopsadv;

public class MultipleTryCatch {

    public static void main(String[] args) {
        divide();

    }


    public static void divide(){

        int value =0;

        int[] a = new int[2];

        try {
            value=10/0;

            System.out.println(a[4]);
        }catch (ArithmeticException e){
            System.out.println("error"+ e);
        }catch (IndexOutOfBoundsException e){
            System.out.println("error"+e);
        }catch (Exception e){
            System.out.println("error"+e);

        }


    }
}
