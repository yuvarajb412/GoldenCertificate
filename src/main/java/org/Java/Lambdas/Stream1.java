package org.Java.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Given a list of strings, write a program to find
 * and print the strings containing duplicate characters using Java Stream API.
 */

public class Stream1 {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("Lio","Bigil","Master","Varisu");

        Predicate<String> stringPredicate=string ->{
            for (int i=0;i<string.length();i++){
                    for (int j=i+1;j<string.length();j++){
                        if(string.charAt(i)==string.charAt(j)){
                            return true;
                        }
                    }
                }
                return false;
        };
        List<String> duplicateString=  list.stream()
                .filter(stringPredicate)
                .toList();
        System.out.println(duplicateString);

    }
}
