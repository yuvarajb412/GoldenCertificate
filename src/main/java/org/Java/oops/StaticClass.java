package org.Java.oops;



public class StaticClass {

    public static void main(String[] args) {

        Outer outer= new Outer();
        outer.OuterMethod();

        Outer.Inner inner =  new Outer.Inner();
        inner.InnerMethod();


    }
}

class Outer{
    private static  int Value;


    public Outer(){
      this.Value = 40;
    }

    public void OuterMethod(){
        System.out.println("This is from outer method");
        System.out.println(Value);
    }


   static class Inner{

     static int Values =20;

        public void InnerMethod(){
            System.out.println("The inner value is"+Value+"The outer value is"+Value);

        }

    }





}
