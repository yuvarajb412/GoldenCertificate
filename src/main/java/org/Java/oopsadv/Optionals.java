package org.Java.oopsadv;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args){
        System.out.println();

       Optional<String> optional=  stringOptionals(null);
        optional.ifPresent(System.out::println);
        System.out.println(optional.orElse("default"));
        System.out.println(optional.orElseGet(()-> "something"));
        try {
            System.out.println(optional.orElseThrow(()-> new IllegalArgumentException("nfng ")));
        }catch (IllegalArgumentException e){

        }








    }


    public static Optional<String> stringOptionals(String s){

        return Optional.empty();

    }
}
