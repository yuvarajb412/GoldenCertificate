package org.Java.oops;


public class InnerClass {
    public static void main(String[] args) {
        outer outers = new outer();
        outer.Inners inner = outers.new Inners();
        outers.nonstatic();
        inner.innerNon();


        outer.Inners.Method();
        outer.outerM();

    }
}

class outer{

       int value =10;

       public static void  outerM(){
           System.out.println("outer");

       }

       public void nonstatic(){
           System.out.println(value);
       }
       class Inners{
           static int add =20;
           public static void Method(){
               System.out.println("inside the inner");
               System.out.println(add);
           }

           public void innerNon(){
               System.out.println("inner non");
           }

       }


        }
