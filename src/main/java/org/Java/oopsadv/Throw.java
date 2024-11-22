package org.Java.oopsadv;

import java.io.IOException;

public class Throw {
    public static void main(String[] args) {
        System.out.println("before divide");
        divideUnChecked();
        System.out.println("hello");
        try {
            divideChecked();
        }catch (IOException e){
            System.out.println(e);
        }

        System.out.println("checked");

    }


    public static void divideUnChecked() {
        try {
            throw  new ArithmeticException();
        }catch (ArithmeticException a){
            System.out.println(a);
        }
    }

    public static void divideChecked() throws IOException{
        throw new IOException();
    }
}


