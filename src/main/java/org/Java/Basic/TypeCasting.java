package org.Java.Basic;

public class TypeCasting {

    public static void main(String[] args){

        //implicit typecasting
        int shortValue=100;
        float largeValue =shortValue;
        System.out.println(shortValue+" "+ largeValue);

        //explicit typecasting
        int value =40;
        short value2 =(short) value;
        System.out.println(value +" "+ value2);


    }
}
