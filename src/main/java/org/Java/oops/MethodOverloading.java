package org.Java.oops;

/*

method overloading comes under the topic of polymorphism

there are two types of polymorphism:
 --static polymorphism
 --dynamic polymorphism


 static polymorphism
 -------  we call also called compile time polymorphism
 this can achieved through method overloading

 method overloading means same name with different parameters

 */
public class MethodOverloading {

    public static void main(String[] args){

        Addition addition = new Addition();
        addition.add(10);
        addition.add("dnjcnbh");

        System.out.println(addition.add(1,2));
        System.out.println(addition.add(1.00,8.9));
        System.out.println(addition.add(1.4f,3.44f));

    }


}

class Addition{

    public int  add(int a,int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public float add(float a, float b){
        return a+b;
    }

    public void add(int a){
        System.out.println("The value is single"+ a + " so we can't able to add it");
    }

    public void  add(String a){
        System.out.println("This is string we can't able to add it");
    }

}
