package org.Java.oops;

public class LocalInner {
    public static void main(String[] args) {

        Local local = new Local();
        local.LocalInnerClass();

    }
}

class Local{


    int value =10;
    static int amount =200;

    public static void LocalInner(){
        System.out.println("it is local inner class");
    }

   public void LocalTitle(){
        System.out.println("LocalTitle");
   }


   public void LocalInnerClass(){
       int a=10 ;
       class LocalInner{

            static  int s=100;
            static int nonFinalStatic = 200;


            public void LocalInnerMethod(){
                System.out.println(a + " " +s++);
                System.out.println(value);
                System.out.println(amount);
                LocalInner();
                LocalTitle();
            }

            public static void some(){
                System.out.println(nonFinalStatic++);
            }

        }

        LocalInner localInner= new LocalInner();
        localInner.LocalInnerMethod();

   }

}
