package org.Java.oops;

public class ClassAndObject {

    String name = "Yuvaraj";
    int id = 1;
    String skills= "Java";



}


class Main{
    public static void main(String[] args){
        ClassAndObject exampleClass = new ClassAndObject();
        System.out.println(exampleClass.id +" "+exampleClass.name+ " "+exampleClass.skills);

    }
}
