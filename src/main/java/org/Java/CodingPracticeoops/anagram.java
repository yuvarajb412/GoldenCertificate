package org.Java.CodingPracticeoops;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a first value");
        String fn = scanner.next();
        System.out.println("enter a first value");
        String sn = scanner.next();


        if(fn.length()!= sn.length()){
            System.out.println("it's not a anagram");
        }else {

            char[] first = fn.toCharArray();
            char[] second = fn.toCharArray();


            Arrays.sort(first);
            Arrays.sort(second);
            if(Arrays.equals(first,second)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        }

    }
}
