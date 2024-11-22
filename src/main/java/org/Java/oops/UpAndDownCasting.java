package org.Java.oops;

public class UpAndDownCasting {

    public static void main(String[] args){

        //upcasting
        A a = new B();
        a.a();


        //instanceOf
        if(a instanceof B){
            //DownCasting
            B b = (B) a;
            b.a();
        }

    }

}

class A{

    public void a(){
        System.out.println("It's from a class A");
    }

}
class B extends A {
    public void a(){
        System.out.println("It's from a Class B");
    }
}
