package org.Java.oops;

public class MethodOverriding {
    public static void main(String[] args){
        overriding2 overriding2 = new overriding2();
        overriding2.add();


    }
}
class overriding1{


    public  void  add(){
        System.out.println("this is addition method of overriding");
    }

}
class overriding2 extends overriding1{

    public void add(){
        System.out.println("this addition method of overriding 2");
    }


}