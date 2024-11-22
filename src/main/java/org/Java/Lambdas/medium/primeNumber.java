package org.Java.Lambdas.medium;

import java.util.Arrays;
import java.util.List;

public class primeNumber {

    public static void main(String[] args) {

        List<Integer>
                list
                = Arrays.asList(2,3,4,5,6,7,8,9,10,11);


        list.stream()
                .filter(primeNumber::isPrime)
                .forEach(System.out::println);













    }


    public  static  boolean isPrime(int number){

        if(number <=1){
            return false;
        }



            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // Divisible, not a prime number
                }
            }
            return true;



    }
}
