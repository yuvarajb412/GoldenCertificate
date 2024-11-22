package org.Java.Basic;

public class Looping {

    public static void forLoop(int value){

        for (int i=0; i<value;i++){
            System.out.println("The value is of forLoop" +i);
        }
    }

    public static void forEach(int[] value){

        for (int val : value){
            System.out.println("The value is of forEach"+val);
        }
    }

    public static void whileLoop(int value){

        int i =0;
        while (i < value){
            System.out.println("The value of while loop is"+ i);
            i++;
        }

    }

    public static void doWhileLoop(int value){
        int i =0;
        do {
            System.out.println("The value of doWhile Loop is "+ i);
            i++;
        }while (i<value);
    }

    public static void main(String[] args){
        forLoop(20);
        forEach(new int[]{10,20,30,40,50});
        whileLoop(10);
        doWhileLoop(2);
    }
}
