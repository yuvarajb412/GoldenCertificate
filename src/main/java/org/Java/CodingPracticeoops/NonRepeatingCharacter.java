package org.Java.CodingPracticeoops;

import java.util.Scanner;

public class NonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        StringBuffer buffer =new StringBuffer(string);

        for (int i=0;i<string.length();i++){
            for (int j=i+1;j<string.length();j++){

                if(buffer.charAt(i)== buffer.charAt(j)){
                    buffer.setCharAt(i,'1');
                    buffer.setCharAt(j,'1');
                }
            }

        }
           for (int i=0;i<buffer.length();i++){

               if(buffer.charAt(i)!='1'){
                   System.out.println(buffer.charAt(i));
                   break;
               }

           }

    }
}
