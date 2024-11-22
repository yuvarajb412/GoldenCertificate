package org.Java.oops;

public class FinalAndStatic {

    final  int finalValue =10;

    static  int staticValue =20;
    int nonStaticValue=21;

    public void count(){
        System.out.println("final"+finalValue);
        System.out.println("static value"+ ++staticValue);
        System.out.println("non static value "+  ++nonStaticValue);
        System.out.println("----------------------------");
    }
}

class statics{

    public static void main(String[] args){
        FinalAndStatic finalAndStatic = new FinalAndStatic();
        finalAndStatic.count();//10,21,22
        finalAndStatic.count();//10,22,23

        System.out.println("Another Object");

        FinalAndStatic finalAndStatic1 = new FinalAndStatic();
        finalAndStatic1.count();//10,23,22
        finalAndStatic1.count();//10,24,23

        finalAndStatic.count();//10,25,24
    }

}
