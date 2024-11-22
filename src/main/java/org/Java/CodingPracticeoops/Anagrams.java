package org.Java.CodingPracticeoops;

import java.util.*;

public class Anagrams
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value 1");
         String str1= scanner.next();
        System.out.println("Enter a String value 2");
        String str2=scanner.next();


        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();



        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1,array2)){
            System.out.println("Annagram");
        }else{
            System.out.println(":not annagram");
        }




    }
}
