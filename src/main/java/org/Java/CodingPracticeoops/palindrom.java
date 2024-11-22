package org.Java.CodingPracticeoops;

import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A integer value or number");
        long value =scanner.nextInt();

        long result=0;
        while (value!=0){

           long sum=value%10;
           result=result*10+sum;
            value=  value/10;

        }

        System.out.println("output"+result);

    }
}
