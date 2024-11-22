package org.Java.oopsadv;

public class tryCatch {

    public static void main(String[] args) throws ArithmeticException {
        System.out.println("Hello");
        try{
            divide();
        }catch (ArithmeticException a){
            System.out.println("error");
        }

        System.out.println("After divide");

    }


    public static void divide() throws ArithmeticException{
        int value =0;
        try{
            value = 10/0;
        }catch (ArithmeticException a){
            System.out.println("error....");
        }



        System.out.println("value is "+ value);

    }
}
