package org.Java.CodingPracticeoops;

import java.util.Scanner;

public class reverseWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string= scanner.nextLine();

        String[] array = string.split("\\s+");

        String output="";

        for (int i= array.length-1;i>=0;i--){
            output=output+" "+array[i];
        }

        System.out.println(output.trim());


    }
}
